package com.example.meetingcodechallange.Model;

import java.util.List;

public class AddressPojo {
    public String city;

    @Override
    public String toString() {
        return "city= " + city +
                ", postalCode= " + postalCode +
                ", state= " + state +
                ", streetAddress= " + streetAddress;
    }

    public String postalCode;
    public String state;
    public String streetAddress;
}
