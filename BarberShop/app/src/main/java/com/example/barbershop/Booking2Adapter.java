package com.example.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Booking2Adapter extends RecyclerView.Adapter<Booking2Adapter.Booking1ViewHolder> {
    Context mContext;
    ArrayList<Booking1> list;
    RecyclerViewClickInterface recyclerViewClickInterface;
    public Booking2Adapter(Context mContext, ArrayList<Booking1> list, RecyclerViewClickInterface recyclerViewClickInterface) {
        this.list = list;
        this.mContext = mContext;
        this.recyclerViewClickInterface = recyclerViewClickInterface;

    }

    @NonNull
    @Override
    public Booking1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_booking1, parent, false);
        return new Booking1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Booking1ViewHolder holder, int position) {
        Booking1 booking1 = list.get(position);
        holder.buttonDay.setText(booking1.getDay());
        holder.buttonDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickInterface.onItemClick2(position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Booking1ViewHolder extends RecyclerView.ViewHolder {
        Button buttonDay;
        public Booking1ViewHolder(@NonNull View itemView) {
            super(itemView);
            buttonDay = itemView.findViewById(R.id.button1);
        }
    }
}
