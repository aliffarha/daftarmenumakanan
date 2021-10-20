package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View.OnClickListener;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    private RecyclerView daftarmenu;
    private ArrayList<menumakanan> listmenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftarmenu = findViewById(R.id.daftarmenu);
        initData();
        daftarmenu.setAdapter(new menumakananAdapter(listmenu));
        daftarmenu.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData() {
        this.listmenu = new ArrayList<>();
        listmenu.add(new menumakanan("Bakmi Rebus",
                "Bakmi rebus dengan kuah kental dan nikmat dan memiliki topping ayam dan telur",
                "Rp 12000",R.drawable.bakmirebus));
        listmenu.add(new menumakanan("Bakmi Goreng",
                "Bakmi goreng nikmat dan lezat dengan topping ayam dan telur",
                "Rp 12000",R.drawable.bakmigoreng));
        listmenu.add(new menumakanan("Nasi Goreng Telur",
                "Nasi goreng telur nikmat,harum dan sedap dengan topping ayam dan telur",
                "Rp 10000",R.drawable.nasigoreng));
        listmenu.add(new menumakanan("Nasi Goreng Babat",
                "Nasi goreng babat nikmat,harum dan sedap dengan topping babat dan telur",
                "Rp 15000",R.drawable.nasgorbabat));
        listmenu.add(new menumakanan("Nasi Goreng Sosis",
                "Nasi goreng sosis nikmat,harum dan sedap dengan topping sosis dan telur",
                "Rp 12000",R.drawable.nasgorsosis));
        listmenu.add(new menumakanan("Nasi Goreng Seafood",
                "Nasi goreng seafood nikmat,harum dan sedap dengan topping udang dan telur",
                "Rp 15000",R.drawable.nasgorseafod));
        listmenu.add(new menumakanan("Nasi Goreng Pete",
                "Nasi goreng pete nikmat,harum dan sedap dengan topping pete dan telur",
                "Rp 12000",R.drawable.nasgorpete));
        listmenu.add(new menumakanan("Nasi Goreng Sapi",
                "Nasi goreng sapi nikmat,harum dan sedap dengan topping daging sapi dan telur",
                "Rp 15000",R.drawable.nasgorsapi));
        listmenu.add(new menumakanan("Nasi Goreng Ati",
                "nasi goreng ati nikmat,harum dan sedap dengan topping ati ayam dan telur",
                "Rp 12000",R.drawable.nasgorati));
        listmenu.add(new menumakanan("Kwetiau Kuah",
                "Kwetiau kuah enak,lezat,sedap dan berkuah kental dengan topping ayam dan telur",
                "Rp 12000",R.drawable.kwetiaukuah));
        listmenu.add(new menumakanan("Kwetiau Goreng",
                "Kwetiau goreng enak lezat sedap dengan topping ayam dan telur",
                "Rp 12000",R.drawable.kwitaugoreng));
        listmenu.add(new menumakanan("Capcay Kuah",
                "Capcay kuah enak,lezat,berkuah kental dengan topping ayam dan telur",
                "Rp 10000",R.drawable.capcaykuah));
        listmenu.add(new menumakanan("Capcay Goreng",
                "Capcay goreng enak,lezat,sedap dengan topping ayam dan telur",
                "Rp 10000",R.drawable.capcaygoreng));


    }



    }







