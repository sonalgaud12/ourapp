package com.sonalgaudsapplication.app.modules.homedemoone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sonalgaudsapplication.app.modules.homedemoone.`data`.model.HomeDemooneModel
import org.koin.core.KoinComponent

class HomeDemooneVM : ViewModel(), KoinComponent {
  val homeDemooneModel: MutableLiveData<HomeDemooneModel> = MutableLiveData(HomeDemooneModel())

  var navArguments: Bundle? = null
}
