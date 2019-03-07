package com.project.android.kotlin.mvpandroidkotlin.login.model

interface LoginModel {
    fun showLoading()

    fun hideLoading()

    fun onLoginRequestFail(msg: String?)

    fun onLoginRequestSucces()

    fun doLoginRequest(usuario: String, password: String)

}