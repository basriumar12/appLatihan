package com.blogbasbas.hariketiga.activty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.blogbasbas.hariketiga.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RsEkaActivity extends AppCompatActivity {

    @BindView(R.id.RsEka)
    WebView RsEka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_eka);
        ButterKnife.bind(this);

        RsEka.getSettings().setJavaScriptEnabled(true);
        RsEka.loadUrl("file:///android_asset/RsEka.html");
    }
}
