package com.project.android.kotlin.mvpandroidkotlin.login.model

import android.content.Context
import com.project.android.kotlin.mvpandroidkotlin.R
import com.project.android.kotlin.mvpandroidkotlin.login.presenter.LoginPresenter
import java.lang.Exception

class LoginModelImpl(val presenter: LoginPresenter) : LoginModel {
    override fun showLoading() {
        presenter.showLoading()
    }

    override fun hideLoading() {
        presenter.hideLoading()
    }

    override fun onLoginRequestFail(msg: String?) {
        presenter.onLoginRequestFail(msg)
    }

    override fun onLoginRequestSucces() {
        presenter.onLoginRequestSucces()
    }

    override fun doLoginRequest(usuario: String, password: String) {
        showLoading()

        //LLAMADA A WEB SERVICE
        Thread {
            Thread.sleep(3000)

            hideLoading()
            onLoginRequestFail(presenter.getMContext().getString(R.string.app_name))
        }.start()
    }
}