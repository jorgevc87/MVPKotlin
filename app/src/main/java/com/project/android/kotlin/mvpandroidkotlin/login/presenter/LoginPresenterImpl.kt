package com.project.android.kotlin.mvpandroidkotlin.login.presenter

import android.content.Context
import com.project.android.kotlin.mvpandroidkotlin.login.model.LoginModel
import com.project.android.kotlin.mvpandroidkotlin.login.model.LoginModelImpl
import com.project.android.kotlin.mvpandroidkotlin.login.view.LoginView

class LoginPresenterImpl(val context: Context, val view: LoginView) : LoginPresenter {

    private val model = LoginModelImpl(this)

    override fun showLoading() {
        view.showLoading()
    }

    override fun hideLoading() {
        view.hideLoading()
    }

    override fun onLoginRequestFail(msg: String?) {
        view.onLoginRequestFail(msg)
    }

    override fun onLoginRequestSucces() {
        view.onLoginRequestSucces()
    }

    override fun getMContext(): Context {
        return context
    }

    override fun doLoginRequest(usuario: String, password: String) {
        model.doLoginRequest(usuario, password)
    }
}