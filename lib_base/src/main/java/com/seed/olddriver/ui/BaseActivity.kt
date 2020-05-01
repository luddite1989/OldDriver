package com.seed.olddriver.ui

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter
import qiu.niorgai.StatusBarCompat

/**
 * 基础Activity
 * @author Duke
 * @date 2020-4-25
 */
abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: ViewBinding

    override fun setContentView(@LayoutRes layoutResID: Int) {
        binding = DataBindingUtil.setContentView<T>(this, layoutResID)
        ARouter.getInstance().inject(this)
        initStatusBar()
    }

    fun <T : ViewModel> getViewModel(modelClass: Class<T>): T =
        ViewModelProvider(this).get(modelClass)

    protected fun initStatusBar() {
        //TODO App主题色不知道
//        StatusBarCompat.setStatusBarColor(this,getColor(R.color.ap) )
        StatusBarCompat.changeToLightStatusBar(this)
    }
}