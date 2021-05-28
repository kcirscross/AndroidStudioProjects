package com.example.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Booking2Adapter extends RecyclerView.Adapter<Booking2Adapter.Booking2ViewHolder> {
    Context mContext;
    ArrayList<Booking2> list;

    public Booking2Adapter(Context mContext, ArrayList<Booking2> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Booking2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_booking2, parent, false);
        return new Booking2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Booking2ViewHolder holder, int position) {
        Booking2 booking2 = list.get(position);
        holder.buttonTime.setText(booking2.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Booking2ViewHolder extends RecyclerView.ViewHolder {

        Button buttonTime;

        public Booking2ViewHolder(@NonNull View itemView) {
            super(itemView);

            buttonTime = itemView.findViewById(R.id.button2);
        }
    }
}