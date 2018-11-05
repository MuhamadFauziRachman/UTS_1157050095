package com.fauzi.utsmobileprogramming;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailPertandinganActivity extends AppCompatActivity {

    ImageView ivLogoAway,ivLogoHome;
    TextView tvNamaHome,tvNamaAway,tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pertandingan);

        Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Match");

        ivLogoAway  = findViewById(R.id.tv_image_away);
        ivLogoHome  = findViewById(R.id.tv_image_home);
        tvNamaAway  = findViewById(R.id.tv_name_away);
        tvNamaHome  = findViewById(R.id.tv_name_home);
        tvDes  = findViewById(R.id.description);

        ivLogoAway.setImageResource(getIntent().getIntExtra("logoTimDua",0));
        ivLogoHome.setImageResource(getIntent().getIntExtra("logoTimSatu",0));

        tvNamaHome.setText(getIntent().getStringExtra("namaTimSatu"));
        tvNamaAway.setText(getIntent().getStringExtra("namaTimDua"));
        tvDes.setText(getIntent().getStringExtra("des"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option, menu);
        return true;
    }

    public void newsApps() {
        String url = "https://wirasetiawan29.wordpress.com/2016/01/01/membuat-option-menu-di-android/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        switch (item.getItemId()) {
            case R.id.news:
                newsApps();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
