package com.example.myapplication;

public class CustomListView {
    String ma;
    String date;
    String text;
    String date_time;
    String location;
    String chucVu;
    String ten;

    public CustomListView(String ma, String date, String text, String date_time, String location, String chucVu, String ten) {
        this.ma = ma;
        this.date = date;
        this.text = text;
        this.date_time = date_time;
        this.location = location;
        this.chucVu = chucVu;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
