package com.example.barbershop;

import java.util.Date;

public class Booking {
    String booking_time;
    String booking_day;

    public Booking() {
    }

    public Booking(String booking_time, String booking_day) {
        this.booking_time = booking_time;
        this.booking_day = booking_day;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getBooking_day() {
        return booking_day;
    }

    public void setBooking_day(String booking_day) {
        this.booking_day = booking_day;
    }
}
