package com.example.meetingcodechallange.Model;

import java.util.List;

public class InformationPojo {
    public  AddressPojo address;
    public String age;
    public String firstName;
    public String lastName;
    public List<PhoneNumberPojo> phoneNumber;

    public String getFullNumber(){
        StringBuilder stringBuilder = new StringBuilder();

        if(phoneNumber == null) {
            return stringBuilder.toString();
        }
        for(PhoneNumberPojo item : phoneNumber){
            stringBuilder.append(item.getPhoneNumber() + "\n");
        }
        return stringBuilder.toString();
    }
}


// { is a JSON object and must have a class or POJO
// [ is an Array of objects or Array of strings

