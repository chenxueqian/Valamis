package com.arcusys.valamis.slide.service

import com.arcusys.valamis.slide.model._
import com.arcusys.valamis.tag.model.ValamisTag


object SlideModelConverters {

  implicit def slideSetModelConversion(
    entity: SlideSetEntity,
    slides: List[SlideModel],
    slidesCount: Option[Long] = None,
    tags: Seq[ValamisTag] = Seq()) =
    SlideSetModel(
      entity.id,
      entity.title,
      entity.description,
      entity.courseId,
      entity.logo,
      slides,
      entity.isTemplate,
      entity.isSelectedContinuity,
      entity.themeId,
      entity.duration,
      entity.scoreLimit,
      entity.playerTitle,
      slidesCount,
      entity.topDownNavigation,
      entity.activityId,
      entity.status,
      entity.version,
      entity.modifiedDate,
      entity.oneAnswerAttempt,
      tags)

  implicit def slideElementPropertyConversion(entity: SlideElementPropertyEntity):SlideElementProperty =
    SlideElementProperty(
      entity.key,
      entity.value)

  implicit def slideElementPropertyListConversion(list: Seq[SlideElementPropertyEntity]): Seq[SlideElementProperty] =
    list.map(slideElementPropertyConversion)

  implicit def slidePropertyConversion(entity: SlidePropertyEntity):SlideProperty =
    SlideProperty(
      entity.key,
      entity.value)

  implicit def slidePropertyListConversion(list: Seq[SlidePropertyEntity]): Seq[SlideProperty] =
    list.map(slidePropertyConversion)


  implicit def deviceConversion(entity: DeviceEntity): Device =
    Device(entity.id, entity.name, entity.minWidth, entity.maxWidth, entity.minHeight, entity.margin)

  implicit def deviceListConversion(list: List[DeviceEntity]): List[Device]=
    list.map(deviceConversion)
}