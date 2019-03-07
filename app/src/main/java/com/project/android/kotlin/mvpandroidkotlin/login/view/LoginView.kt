package com.project.android.kotlin.mvpandroidkotlin.login.view

interface LoginView {

    fun showLoading()

    fun hideLoading()

    fun onLoginRequestFail(msg: String?)

    fun onLoginRequestSucces()

}