package com.chargebee.app.week2.day12.phonedirectory.week2model;
import java.util.*;
public class Contact{
    private String phoneNumber;
    private String phoneNumberType;
    private String emailId;
    public Contact(String phoneNumber,String phoneNumberType,String emailId){
        this.phoneNumber = phoneNumber;
        this.phoneNumberType = phoneNumberType;
        this.emailId = emailId;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getPhoneNumberType(){
        return phoneNumberType;
    }
    public String getEmailId(){
        return emailId;
    }
}