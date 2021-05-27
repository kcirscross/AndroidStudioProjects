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
    private int layout;
    private List<Booking> arraylist;

    public BookingAdapter(Context context, int layout, List<Booking> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
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
LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
convertView = inflater.inflate(layout,null);
Booking booking = arraylist.get(position);

Button button1 = convertView.findViewById(R.id.button1);
Button button2 = convertView.findViewById(R.id.button2);

button1.setText(booking.getBooking_day());
button2.setText(booking.getBooking_time());
        return convertView;
    }
}

