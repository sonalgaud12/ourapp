package com.sonalgaudsapplication.app.modules.depth0frameone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sonalgaudsapplication.app.modules.depth0frameone.`data`.model.Depth0FrameOneModel
import org.koin.core.KoinComponent

class Depth0FrameOneVM : ViewModel(), KoinComponent {
  val depth0FrameOneModel: MutableLiveData<Depth0FrameOneModel> =
      MutableLiveData(Depth0FrameOneModel())

  var navArguments: Bundle? = null
}
