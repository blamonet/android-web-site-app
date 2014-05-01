package com.github.blamonet;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AppBrowser extends Activity {
    static final String url = "http://www.blamonet.com";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView browser = (WebView)findViewById(R.id.browser);
	browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl(url);
    }
}
