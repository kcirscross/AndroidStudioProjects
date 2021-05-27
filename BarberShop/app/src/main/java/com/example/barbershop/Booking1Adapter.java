package com.example.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Booking1Adapter extends RecyclerView.Adapter<Booking1Adapter.Booking1ViewHolder> {
    private Context mContext;
    private List<Booking1> mListBooking1;

    public Booking1Adapter(Context mContext) {
        this.mContext = mContext;
    }
public void setData(List<Booking1> list){
        this.mListBooking1 = list;
        notifyDataSetChanged();
}
    @NonNull
    @Override
    public Booking1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_booking1, parent, false);
        return new Booking1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Booking1ViewHolder holder, int position) {
        Booking1 booking1 = mListBooking1.get(position);
        if (booking1 == null) {
            return;
        }
        holder.buttonDay.setText(booking1.getDay());
    }

    @Override
    public int getItemCount() {
        if (mListBooking1 != null) {
            return mListBooking1.size();
        }
        return 0;
    }

    public class Booking1ViewHolder extends RecyclerView.ViewHolder{

        private Button buttonDay;

        public Booking1ViewHolder(@NonNull View itemView) {
            super(itemView);

            buttonDay = itemView.findViewById(R.id.button1);
        }
    }
}
