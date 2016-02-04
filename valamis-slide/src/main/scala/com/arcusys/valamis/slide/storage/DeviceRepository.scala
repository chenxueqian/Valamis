package com.arcusys.valamis.slide.storage

import com.arcusys.valamis.slide.model.DeviceEntity

/**
 * Created by Igor Borisov on 02.11.15.
 */
trait DeviceRepository {
  def getAll: Seq[DeviceEntity]
}
