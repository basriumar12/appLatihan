package com.blogbasbas.hariketiga.activty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.blogbasbas.hariketiga.R;

/**
 * Created by Server on 27/09/2017.
 */

public class RsIbnuSinaActivity extends AppCompatActivity {

    WebView RsAchmad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_arifin_achmad);

        RsAchmad = (WebView) findViewById(R.id.RsAchmad);

        RsAchmad.getSettings().setJavaScriptEnabled(true);
        RsAchmad.loadUrl("file:///android_asset/RsIbnusina.html");
    }
}

