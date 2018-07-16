package com.chargebee.app.week2.day23.csvoperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Customer{
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("company")
    @Expose
    private String company;
    public Customer(String first_name, String last_name, String email, String company){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.company = company;
    }        
}