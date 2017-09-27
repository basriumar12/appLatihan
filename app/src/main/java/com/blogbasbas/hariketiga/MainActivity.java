package com.blogbasbas.hariketiga;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.blogbasbas.hariketiga.activty.GetHTMLActivity;
import com.blogbasbas.hariketiga.activty.MyBrowserActivity;
import com.blogbasbas.hariketiga.activty.RumahSakitActivity;
import com.blogbasbas.hariketiga.activty.YoutubeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ImgRs)
    ImageView ImgRs;
    @BindView(R.id.ImgMyBrowser)
    ImageView ImgMyBrowser;
    @BindView(R.id.ImgYoutube)
    ImageView ImgYoutube;
    @BindView(R.id.ImgFacebook)
    ImageView ImgFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mn_exit) {

            showExit();


        } else if (id == R.id.mn_rs) {

        } else if (id == R.id.mn_youtube) {

            startActivity(new Intent(MainActivity.this, YoutubeActivity.class));

        } else if (id == R.id.mn_about) {
            showAbout();
        } else if (id == R.id.mn_facebook) {
            startActivity(new Intent(MainActivity.this, GetHTMLActivity.class));

        } else if (id == R.id.mn_mybrowser) {
            startActivity(new Intent(MainActivity.this, MyBrowserActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    private void showAbout() {

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle(" My WebApp ");
        alert.setMessage("App Webview Version 1.0.0 - Copyright 2017");

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });
        alert.show();

    }

    private void showExit() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Konfirmasi Exit");
        alert.setMessage(" Apakah Akan keluar ?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                System.exit(0);
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alert.show();
    }

    @OnClick({R.id.ImgRs, R.id.ImgMyBrowser, R.id.ImgYoutube, R.id.ImgFacebook})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ImgRs:
                startActivity(new Intent(MainActivity.this, RumahSakitActivity.class));
                break;
            case R.id.ImgMyBrowser:
                startActivity(new Intent(MainActivity.this,
                        MyBrowserActivity.class));
                break;
            case R.id.ImgYoutube:
                startActivity(new Intent(MainActivity.this,
                        YoutubeActivity.class));
                break;
            case R.id.ImgFacebook:
                startActivity(new Intent(MainActivity.this,
                        GetHTMLActivity.class));
                break;
        }
    }
}
