package com.example.barbershop;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileMenuAdapter extends BaseAdapter {
    ArrayList<ProfileMenu> listMenu;

    public ProfileMenuAdapter(ArrayList<ProfileMenu> listMenu) {
        this.listMenu = listMenu;
    }

    @Override
    public int getCount() {
        return listMenu.size();
    }

    @Override
    public Object getItem(int position) {
        return listMenu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.profile_menu_view, null);
        } else viewProduct = convertView;
        ((TextView) viewProduct.findViewById(R.id.menu_textview)).setText(listMenu.get(position).menu);
        return viewProduct;
    }
}
