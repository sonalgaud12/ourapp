package com.sonalgaudsapplication.app.modules.depth0frameone.ui

import androidx.activity.viewModels
import com.sonalgaudsapplication.app.R
import com.sonalgaudsapplication.app.appcomponents.base.BaseActivity
import com.sonalgaudsapplication.app.databinding.ActivityDepth0FrameOneBinding
import com.sonalgaudsapplication.app.modules.depth0frameone.`data`.viewmodel.Depth0FrameOneVM
import kotlin.String
import kotlin.Unit

class Depth0FrameOneActivity :
    BaseActivity<ActivityDepth0FrameOneBinding>(R.layout.activity_depth_0_frame_one) {
  private val viewModel: Depth0FrameOneVM by viewModels<Depth0FrameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.depth0FrameOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DEPTH0FRAME_ONE_ACTIVITY"

  }
}
