package com.sonalgaudsapplication.app.modules.androidlargeone.ui

import androidx.activity.viewModels
import com.sonalgaudsapplication.app.R
import com.sonalgaudsapplication.app.appcomponents.base.BaseActivity
import com.sonalgaudsapplication.app.databinding.ActivityAndroidLargeOneBinding
import com.sonalgaudsapplication.app.modules.androidlargeone.`data`.viewmodel.AndroidLargeOneVM
import kotlin.String
import kotlin.Unit

class AndroidLargeOneActivity :
    BaseActivity<ActivityAndroidLargeOneBinding>(R.layout.activity_android_large_one) {
  private val viewModel: AndroidLargeOneVM by viewModels<AndroidLargeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ONE_ACTIVITY"

  }
}
