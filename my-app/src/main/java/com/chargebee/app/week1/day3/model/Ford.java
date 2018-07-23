package com.chargebee.app.week1.day3.model;

public class Ford extends Car{
    private Integer year;
    private Integer manufactureDiscount;
    public Ford(){
        
    }
    public Integer getYear(){
        return year;
    }
    public void setYear(Integer year){
        this.year = year;
    }

    public Integer getManufactureDiscount(){
        return year;
    }
    public void setManufactureDiscount(Integer manufactureDiscount){
        this.manufactureDiscount = manufactureDiscount;
    }
    public Integer getSalePrice(){
        return salePrice;
    }

    @Override
    public void setSalePrice(Integer salePrice){
        this.salePrice = salePrice;
    }
}