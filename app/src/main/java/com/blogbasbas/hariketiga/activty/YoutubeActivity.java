package com.blogbasbas.hariketiga.activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blogbasbas.hariketiga.R;

public class YoutubeActivity extends AppCompatActivity {

    WebView webViewYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        webViewYoutube = (WebView) findViewById(R.id.webviewYoutube);
        webViewYoutube.setWebViewClient(new WebViewClient());
        webViewYoutube.getSettings().setJavaScriptEnabled(true);
        webViewYoutube.loadUrl("http://youtube.com");


    }

    @Override
    public void onBackPressed() {
        if (webViewYoutube.canGoBack()){
            webViewYoutube.goBack();
        }else {
        super.onBackPressed();
    }
    }
}
