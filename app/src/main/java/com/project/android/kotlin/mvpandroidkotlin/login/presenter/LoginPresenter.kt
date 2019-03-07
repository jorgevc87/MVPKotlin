package com.project.android.kotlin.mvpandroidkotlin.login.presenter

import android.content.Context

interface LoginPresenter {
    fun showLoading()

    fun hideLoading()

    fun onLoginRequestFail(msg: String?)

    fun onLoginRequestSucces()

    fun getMContext(): Context

    fun doLoginRequest(usuario: String, password: String)

}