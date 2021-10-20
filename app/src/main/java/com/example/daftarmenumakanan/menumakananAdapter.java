package com.example.daftarmenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class menumakananAdapter extends RecyclerView.Adapter<menumakananAdapter.ViewHolder> {


    public menumakananAdapter(ArrayList<menumakanan> listmenu) {
        this.listmenu = listmenu;
    }

    private ArrayList<menumakanan> listmenu;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =  LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.itemmenu,parent,false));

    return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull menumakananAdapter.ViewHolder holder, int position) {
        menumakanan menumakanan = listmenu.get(position);
        holder.txtNama.setText(menumakanan.getNama());
        holder.hargamakanan.setText(menumakanan.getHarga());
        holder.imgfoto.setImageResource(menumakanan.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Context context = holder.itemView.getContext();
                    Intent intent = new Intent(context, detailmenu.class);
                    intent.putExtra("nmmakanan", menumakanan.getNama());
                    intent.putExtra("deskmakanan", menumakanan.getDeskripsi());
                    intent.putExtra("hargamakanan", menumakanan.getHarga());
                    intent.putExtra("imgmakanan", menumakanan.getId_gambar());
                    context.startActivity(intent);

                } catch (Exception e) {
                    Toast.makeText(view.getContext(), "gagal", Toast.LENGTH_SHORT);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return listmenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtNama, hargamakanan;
        public ImageView imgfoto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            hargamakanan = (TextView) itemView.findViewById(R.id.hargamakanan);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgfoto);
        }
    }
}
