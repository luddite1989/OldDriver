package com.seed.olddriver.ui

import androidx.databinding.ViewDataBinding

/**
 * 带标题的基础Activity
 * @author duke
 * @date 2020-5-1
 */
class BaseTitleActivity<T : ViewDataBinding> : BaseActivity<T>() {


    override fun setContentView(layoutResID: Int) {


        initStatusBar()
    }

}