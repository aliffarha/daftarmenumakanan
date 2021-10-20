package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailmenu<makanan> extends AppCompatActivity {
   ImageView gambarmenu_masuk;
   TextView namamenu_masuk;
    TextView desmenu_masuk;
    TextView hargamenu_masuk;


   String nm_kunci="nmmakanan";
   String desk_kunci="deskmakanan";
   String harga_kunci="hargamakanan";
   int imgmakanan;

   String namamenu;
   String deskmenu;
   String hargamenu;






    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);
        gambarmenu_masuk=findViewById(R.id.getId_gambar);
        namamenu_masuk=findViewById(R.id.getNama);
        desmenu_masuk=findViewById(R.id.getDeskripsi);
        hargamenu_masuk=findViewById(R.id.getHarga);

        Bundle bundle = getIntent().getExtras();

        imgmakanan=bundle.getInt(String.valueOf("imgmakanan"));
        gambarmenu_masuk.setImageResource(imgmakanan);
        namamenu=bundle.getString("nmmakanan");
        namamenu_masuk.setText(namamenu);
        deskmenu=bundle.getString("deskmakanan");
        desmenu_masuk.setText(deskmenu);
        hargamenu=bundle.getString("hargamakanan");
        hargamenu_masuk.setText(hargamenu);

    }
}