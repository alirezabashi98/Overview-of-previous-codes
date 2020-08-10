package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ClickableSpan
import android.view.View
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {

    val url_webView = "https://www.android.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webView.settings.apply {
            javaScriptEnabled = true
            javaScriptCanOpenWindowsAutomatically = true
            setSupportZoom(true)
        }

        val alertDialog_Loading = AlertDialog.Builder(this)
            .setView(R.layout.sim_alert_dialog_loading)
            .setCancelable(false)
            .create()

        webView.webViewClient = object : WebViewClient(){

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

                alertDialog_Loading.show()

            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)

                alertDialog_Loading.cancel()

            }

        }

        btn_load.setOnClickListener {

            webView.loadUrl(url_webView)

        }

    }

}