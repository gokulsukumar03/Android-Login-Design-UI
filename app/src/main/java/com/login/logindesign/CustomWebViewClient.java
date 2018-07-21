package com.login.logindesign;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Sukumar on 7/21/2018.
 */

class CustomWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
