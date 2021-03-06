package com.arcusys.learn.liferay.update.version270

import java.sql.Connection

import com.arcusys.learn.liferay.update.version260.slide.SlideTableComponent
import com.arcusys.valamis.persistence.common.SlickDBInfo
import org.scalatest.{BeforeAndAfter, FunSuite}

import scala.slick.driver.{H2Driver, JdbcDriver, JdbcProfile}
import scala.slick.jdbc.JdbcBackend

class UpdateLessonSummaryElementsTest extends FunSuite with BeforeAndAfter{

  val driver = H2Driver
  import driver.simple._
  val db = Database.forURL("jdbc:h2:mem:lessonsummary", driver = "org.h2.Driver")
  var connection: Connection = _

  val dbInfo = new SlickDBInfo {
    def databaseDef: JdbcBackend#DatabaseDef = db
    def slickProfile: JdbcProfile = driver
    def slickDriver: JdbcDriver = driver
  }

  before {
    connection = db.source.createConnection()
    table.createSchema()
  }
  after {
    connection.close()
  }

  val table = new SlideTableComponent {
    override protected val driver: JdbcProfile = H2Driver

    def createSchema(): Unit = db.withSession { implicit s =>
      import driver.simple._
      (slides.ddl ++ slideElements.ddl).create
    }
  }

  val updater = new DBUpdater2706(dbInfo)

  test("update lesson summary elements"){
    import table._
    val slide = Slide(title = "page", slideSetId = 1L, isTemplate = true, isLessonSummary = true)
    val slideId = db.withSession { implicit s =>
      slides returning slides.map(_.id) += slide
    }
    val slideElement = SlideElement(
      top = "1",
      left = "1",
      width = "1",
      height = "1",
      zIndex = "1",
      content = "content",
      slideEntityType = "1",
      slideId = slideId)

    db.withTransaction { implicit s =>
      slideElements += slideElement
    }
    updater.doUpgrade()

    val stored = db.withSession { implicit s =>
      slideElements.filter(_.zIndex === "1").firstOption
        .getOrElse(fail("no slideElements was created"))
    }

    assert(stored.content == "<div><strong><span style=\"font-size:1.5em; font-weight:normal;\">Lesson Summary</span></strong></div>")
  }

  test("update other elements"){
    import table._
    val slide = Slide(title = "page", slideSetId = 1L, isTemplate = false, isLessonSummary = true)
    val slideId = db.withSession { implicit s =>
      slides returning slides.map(_.id) += slide
    }
    val slideElement = SlideElement(
      top = "1",
      left = "1",
      width = "1",
      height = "1",
      zIndex = "1",
      content = "content",
      slideEntityType = "1",
      slideId = slideId)

    db.withTransaction { implicit s =>
      slideElements += slideElement
    }
    updater.doUpgrade()

    val stored = db.withSession { implicit s =>
      slideElements.filter(_.zIndex === "1").firstOption
        .getOrElse(fail("no slideElements was created"))
    }

    assert(stored.content == "content")
  }
}
