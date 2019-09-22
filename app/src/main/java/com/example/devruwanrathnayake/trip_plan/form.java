package com.example.devruwanrathnayake.trip_plan;

import android.widget.DatePicker;

public class form {
        private String customerName;
        private String email;
        private String tp;
        private String rooms;
        private String roomtype;
        private DatePicker in;
        private DatePicker out;

    public form() {
        this.customerName = customerName;
        this.email = email;
        this.tp = tp;
        this.rooms = rooms;
        this.roomtype = roomtype;
        this.in = in;
        this.out = out;
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public DatePicker getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public DatePicker getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
