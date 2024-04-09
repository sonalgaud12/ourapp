package com.sonalgaudsapplication.app.modules.homedemoone.ui

import androidx.activity.viewModels
import com.sonalgaudsapplication.app.R
import com.sonalgaudsapplication.app.appcomponents.base.BaseActivity
import com.sonalgaudsapplication.app.databinding.ActivityHomeDemooneBinding
import com.sonalgaudsapplication.app.modules.homedemoone.`data`.viewmodel.HomeDemooneVM
import kotlin.String
import kotlin.Unit

class HomeDemooneActivity : BaseActivity<ActivityHomeDemooneBinding>(R.layout.activity_home_demoone)
    {
  private val viewModel: HomeDemooneVM by viewModels<HomeDemooneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeDemooneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_DEMOONE_ACTIVITY"

  }
}
