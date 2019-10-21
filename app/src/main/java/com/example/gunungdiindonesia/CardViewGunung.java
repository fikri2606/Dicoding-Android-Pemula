package com.example.gunungdiindonesia;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewGunung extends RecyclerView.Adapter<CardViewGunung.CardViewViewHolder> {

    private Context context;
    private ArrayList<Gunung> cardGunung;

    private ArrayList<Gunung> getCardGunung() {
        return cardGunung;
    }

    public void setCardGunung(ArrayList<Gunung> cardGunung) {
        this.cardGunung = cardGunung;
    }

    public CardViewGunung(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_gunung, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holderCardView, int posisi) {

        final Gunung gunung = getCardGunung().get(posisi);
        Glide.with(context)
                .load(gunung.getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(holderCardView.imgGambar);
        holderCardView.tvNama.setText(gunung.getNama());
        holderCardView.tvTinggi.setText(gunung.getTinggi());
        holderCardView.tvLokasi.setText(gunung.getLokasi());

        holderCardView.tmblSuka.setOnClickListener(new CostumItemClikListener(posisi, new CostumItemClikListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda Menyukai " + getCardGunung().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));
        holderCardView.tmblBagikan.setOnClickListener(new CostumItemClikListener(posisi, new CostumItemClikListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda Membagikan " + getCardGunung().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));
        holderCardView.itemView.setOnClickListener(new CostumItemClikListener(posisi, new CostumItemClikListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda Memilih " + getCardGunung().get(position).getNama(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailGunung.class);
                intent.putExtra("gambar_gunung", gunung.getGambar());
                Log.i("cek gambar","gambar="+gunung.getGambar());
                intent.putExtra("nama_gunung", gunung.getNama());
                intent.putExtra("tinggi_gunung", gunung.getTinggi());
                intent.putExtra("lokasi_gunung", gunung.getLokasi());
                intent.putExtra("detail_gunung", gunung.getDetail());
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getCardGunung().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvNama, tvTinggi, tvLokasi;
        Button tmblSuka, tmblBagikan;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.img_item_gambar);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvTinggi = itemView.findViewById(R.id.tv_item_tinggi);
            tvLokasi = itemView.findViewById(R.id.tv_item_lokasi);
            tmblSuka = itemView.findViewById(R.id.tmbl_suka);
            tmblBagikan = itemView.findViewById(R.id.tmbl_bagikan);
        }
    }
}


