package com.example.gunungdiindonesia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailGunung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gunung);

        dataIntent();
    }

    private void dataIntent() {

        if (getIntent().hasExtra("gambar_gunung") && getIntent().hasExtra("nama_gunung") && getIntent().hasExtra("tinggi_gunung") && getIntent().hasExtra("lokasi_gunung") && getIntent().hasExtra("detail_gunung")) {

            Integer gambarGunung = getIntent().getIntExtra("gambar_gunung",0);
            String namaGunung = getIntent().getStringExtra("nama_gunung");
            String tinggiGunung = getIntent().getStringExtra("tinggi_gunung");
            String lokasiGunung = getIntent().getStringExtra("lokasi_gunung");
            String detailgunung = getIntent().getStringExtra("detail_gunung");

            setImage(gambarGunung, namaGunung, tinggiGunung, lokasiGunung, detailgunung);

        }
    }

    private void setImage(Integer gambarGunung, String namaGunung, String tinggiGunung, String lokasiGunung, String detailGunung) {

        ImageView gambar = findViewById(R.id.img_item_gambar1);
        Glide.with(this)
                .asBitmap()
                .load(gambarGunung)
                .into(gambar);


        TextView nama = findViewById(R.id.tv_item_nama);
        nama.setText(namaGunung);

        TextView lokasi = findViewById(R.id.tv_item_lokasi);
        lokasi.setText(lokasiGunung);

        TextView tinggi = findViewById(R.id.tv_item_tinggi);
        tinggi.setText(tinggiGunung);

        TextView detail = findViewById(R.id.tv_item_detail);
        detail.setText(detailGunung);

    }
}
