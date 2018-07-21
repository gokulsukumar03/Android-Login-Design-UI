package com.login.logindesign;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView htmlWebView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        htmlWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSetting = htmlWebView.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webSetting.setDomStorageEnabled(true);
        webSetting.setDisplayZoomControls(true);
        htmlWebView.setWebViewClient(new CustomWebViewClient());
        htmlWebView.loadUrl("www.google.com");

    }

    @Override
    public void onBackPressed() {
        if (htmlWebView.canGoBack()) {
            htmlWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
