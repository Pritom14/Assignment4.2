package com.example.shaloin.fourthassignmentb;

/**
 * Created by shaloin on 24/10/16.
 */

public class User {

    private String name;
    private int phone;

    public User(){}

    public User(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
