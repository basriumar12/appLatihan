package com.blogbasbas.hariketiga.activty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.blogbasbas.hariketiga.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RsArifinAchmadActivity extends AppCompatActivity {

    @BindView(R.id.RsAchmad)
    WebView RsAchmad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_arifin_achmad);
        ButterKnife.bind(this);


        RsAchmad.getSettings().setJavaScriptEnabled(true);
        RsAchmad.loadUrl("file:///android_asset/RsArifinAchmad.html");
    }
}
