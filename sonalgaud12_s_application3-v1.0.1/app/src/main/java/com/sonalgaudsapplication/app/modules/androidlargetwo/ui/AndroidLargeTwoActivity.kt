package com.sonalgaudsapplication.app.modules.androidlargetwo.ui

import androidx.activity.viewModels
import com.sonalgaudsapplication.app.R
import com.sonalgaudsapplication.app.appcomponents.base.BaseActivity
import com.sonalgaudsapplication.app.databinding.ActivityAndroidLargeTwoBinding
import com.sonalgaudsapplication.app.modules.androidlargetwo.`data`.viewmodel.AndroidLargeTwoVM
import kotlin.String
import kotlin.Unit

class AndroidLargeTwoActivity :
    BaseActivity<ActivityAndroidLargeTwoBinding>(R.layout.activity_android_large_two) {
  private val viewModel: AndroidLargeTwoVM by viewModels<AndroidLargeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_TWO_ACTIVITY"

  }
}
