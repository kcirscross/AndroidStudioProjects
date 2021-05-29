package com.example.barbershop;

public class ScheduleInformation {
    String email, display_name;

    public ScheduleInformation() {
    }

    public ScheduleInformation(String email, String display_name) {
        this.email = email;
        this.display_name = display_name;
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

}
