package com.example.barbershop;

public class ScheduleInformation {
    String email, display_name, day, hour;

    public ScheduleInformation() {
    }

    public ScheduleInformation(String email, String display_name, String day, String hour) {
        this.email = email;
        this.display_name = display_name;
        this.day = day;
        this.hour = hour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
