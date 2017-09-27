package com.blogbasbas.hariketiga.activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blogbasbas.hariketiga.R;

public class GetHTMLActivity extends AppCompatActivity {
        WebView webGetHtml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_html);

        webGetHtml = (WebView) findViewById(R.id.WebGetHtml);
        webGetHtml.getSettings().setJavaScriptEnabled(true);
        webGetHtml.setWebViewClient(new WebViewClient());
        webGetHtml.loadUrl("http://facebook.com");

    }
}
