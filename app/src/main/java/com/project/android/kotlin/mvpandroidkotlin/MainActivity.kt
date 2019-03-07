package com.project.android.kotlin.mvpandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.project.android.kotlin.mvpandroidkotlin.login.presenter.LoginPresenter
import com.project.android.kotlin.mvpandroidkotlin.login.presenter.LoginPresenterImpl
import com.project.android.kotlin.mvpandroidkotlin.login.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, LoginView {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_ingresar -> {
                //Toast.makeText(this@MainActivity, "Ingresar", Toast.LENGTH_SHORT).show()
                presenter.doLoginRequest("", "")
            }
        }
    }

    override fun showLoading() {
        runOnUiThread {
            progress.visibility = View.VISIBLE
        }
    }

    override fun hideLoading() {
        runOnUiThread {
            progress.visibility = View.GONE
        }
    }

    override fun onLoginRequestFail(msg: String?) {
        runOnUiThread { Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() }
    }

    override fun onLoginRequestSucces() {
        runOnUiThread {
            Toast.makeText(this, "Login Exitoso", Toast.LENGTH_SHORT).show()
        }
    }

    private fun init() {
        btn_ingresar.setOnClickListener(this)

        presenter = LoginPresenterImpl(this, this)
    }
}
