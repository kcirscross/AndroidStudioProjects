 package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    ArrayList<CustomListView> dataListView;
    Context context;

    public CustomAdapter(ArrayList<CustomListView> dataListView, Context context) {
        this.dataListView = dataListView;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.activity_mon_an,parent,false);
        return new CustomAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        holder.txtChuc_Vu.setText(dataListView.get(position).getChucVu());
        holder.txtDate.setText(dataListView.get(position).getDate());
        holder.txtMa.setText(dataListView.get(position).getMa());
        holder.txtDate_Time.setText(dataListView.get(position).getDate_time());
        holder.txtLocation.setText(dataListView.get(position).getLocation());
        holder.txtName.setText(dataListView.get(position).getTen());
        holder.txtText.setText(dataListView.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return dataListView.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtMa;
        TextView txtText;
        TextView txtDate;
        TextView txtDate_Time;
        TextView txtLocation;
        TextView txtChuc_Vu;
        TextView txtName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMa = (TextView) itemView.findViewById(R.id.ma);
            txtText = (TextView) itemView.findViewById(R.id.text);
            txtDate = (TextView) itemView.findViewById(R.id.date);
            txtDate_Time = (TextView) itemView.findViewById(R.id.datetime);
            txtLocation = (TextView) itemView.findViewById(R.id.location);
            txtChuc_Vu = (TextView) itemView.findViewById(R.id.chucvu);
            txtName = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
