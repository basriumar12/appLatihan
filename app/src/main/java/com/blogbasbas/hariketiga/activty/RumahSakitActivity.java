package com.blogbasbas.hariketiga.activty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.blogbasbas.hariketiga.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RumahSakitActivity extends AppCompatActivity {

    @BindView(R.id.lvRumahSakit)
    ListView lvRumahSakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_sakit);
        ButterKnife.bind(this);

        lvRumahSakit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int posisi, long l) {
                switch (posisi){
                    case 0:
                        startActivity(new Intent(RumahSakitActivity.this,
                                RsArifinAchmadActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(RumahSakitActivity.this,
                                RsEkaActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(RumahSakitActivity.this,
                                RsEriaBunda.class));
                        break;
                    case 3:
                        startActivity(new Intent(RumahSakitActivity.this,
                                RsIbnuSinaActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(RumahSakitActivity.this,
                                RsJiwaTampan.class));
                        break;
                }

            }
        });
    }
}
