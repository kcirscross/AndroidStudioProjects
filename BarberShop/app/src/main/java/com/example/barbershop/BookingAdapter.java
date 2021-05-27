package com.example.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BookingAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layout;
    private List<Booking> arraylist;

    public BookingAdapter(Context context, List<Booking> arraylist) {
        this.context = context;
        this.arraylist = arraylist;
        this.layout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layout.inflate(R.layout.layout_booking, null);
        Booking booking = arraylist.get(position);

        Button button1 = convertView.findViewById(R.id.button1);
        Button button2 = convertView.findViewById(R.id.button2);

        button1.setText(booking.getBooking_day());
        button2.setText(booking.getBooking_time());
        return convertView;
    }
}

