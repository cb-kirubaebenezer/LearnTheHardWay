package com.chargebee.app.week1.day3.model;
import com.chargebee.app.week1.utilities.*;
import com.chargebee.app.week1.day3.model.*;

public class Sedan extends Car{
    private Integer length;
    public Sedan(){

    }
    public Integer getLength(){
        return length;
    }
    public void setLength(Integer length){
        this.length = length;
    }
    public Integer getSalePrice(){
        return salePrice;
    }
    @Override
    public void setSalePrice(Integer salePrice){
        this.salePrice = salePrice;
    }
}