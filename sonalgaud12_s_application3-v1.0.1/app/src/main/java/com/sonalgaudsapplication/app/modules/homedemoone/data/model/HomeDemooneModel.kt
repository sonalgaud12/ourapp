package com.sonalgaudsapplication.app.modules.homedemoone.`data`.model

import com.sonalgaudsapplication.app.R
import com.sonalgaudsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeDemooneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_170_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThatsatleast: String? =
      MyApp.getInstance().resources.getString(R.string.msg_that_s_at_least)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTeachyourkids: String? =
      MyApp.getInstance().resources.getString(R.string.msg_teach_your_kids)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnhowto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_how_to_segregate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakealookat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_a_look_at_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWaste: String? = MyApp.getInstance().resources.getString(R.string.msg_waste_segregation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollections: String? = MyApp.getInstance().resources.getString(R.string.lbl_collections)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRewards: String? = MyApp.getInstance().resources.getString(R.string.lbl_rewards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
