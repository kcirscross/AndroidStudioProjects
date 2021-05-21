package com.example.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.ViewHolder> {
    ArrayList<Booking> dataBooking;
    Context context;

    public BookingAdapter(ArrayList<Booking> dataBooking, Context context) {
        this.dataBooking = dataBooking;
        this.context = context;
    }

    @NonNull
    @Override
    public BookingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.booking_button,parent,false);
        return new BookingAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingAdapter.ViewHolder holder, int position) {
        holder.booking_button.setText(dataBooking.get(position).getBooking_time());
    }

    @Override
    public int getItemCount() {
        return dataBooking.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        Button booking_button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            booking_button = (Button) itemView.findViewById(R.id.booking_button);
        }
    }
}
