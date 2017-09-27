package com.blogbasbas.hariketiga.activty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.blogbasbas.hariketiga.R;

import butterknife.ButterKnife;

public class MyBrowserActivity extends AppCompatActivity {


    EditText edtPencarian;

    WebView webviewMybrowser;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);
        ButterKnife.bind(this);

        edtPencarian = (EditText)findViewById(R.id.edtPencarian);
        webviewMybrowser = (WebView) findViewById(R.id.webviewMybrowser);

        button = (Button)findViewById(R.id.btnPencarian);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(" Log Button", "Coba");
                Toast.makeText(MyBrowserActivity.this, "Go To Url", Toast.LENGTH_SHORT).show();
                PencarianUrl();
            }
        });
    }


    private void PencarianUrl() {
        String edtPen = edtPencarian.getText().toString();
        webviewMybrowser.setWebViewClient(new WebViewClient());
        webviewMybrowser.getSettings().setJavaScriptEnabled(true);

        webviewMybrowser.loadUrl("http://google.com"+edtPen);
        Log.d(" Log Button", "Coba" +edtPen);

    }
}
