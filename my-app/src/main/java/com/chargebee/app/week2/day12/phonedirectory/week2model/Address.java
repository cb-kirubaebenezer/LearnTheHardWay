package com.chargebee.app.week2.day12.phonedirectory.week2model;
import java.util.*;
public class Address{
    private String streetNo;
    private String areaName;
    private String city;
    public Address(String streetNo, String areaName, String city){
        this.streetNo = streetNo;
        this.areaName = areaName;
        this.city = city;
    }
    public String getStreetNo(){
        return streetNo;
    }
    public String getAreaName(){
        return areaName;
    }
    public String getCity(){
        return city;
    }
}