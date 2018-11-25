package com.example.fikridzakwan.sunsetplace;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterSunset extends RecyclerView.Adapter<AdapterSunset.ViewHolder> {

    Context context;
    int[] gambarSunset;
    String[] namaSunset;

    public AdapterSunset(Context context, int[] gambarSunset, String[] namaSunset) {
        this.context = context;
        this.gambarSunset = gambarSunset;
        this.namaSunset = namaSunset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_sunset, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txtNamaSunset.setText(namaSunset[i]);
        Glide.with(context).load(gambarSunset[i]).into(viewHolder.imgLogoSunset);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("NamaSunset", namaSunset[i]);
                intent.putExtra("GambarSunset", gambarSunset[i]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarSunset.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaSunset;
        ImageView imgLogoSunset;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogoSunset = itemView.findViewById(R.id.imgLogoSunset);
            txtNamaSunset = itemView.findViewById(R.id.txtNamaSunset);
        }
    }
}
