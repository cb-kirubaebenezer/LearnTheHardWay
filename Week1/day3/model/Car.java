package day3.model;
import utilities.*;

public abstract class Car{
    private Integer speed;
    private Double regularPrice;
    private String color;
    protected Integer salePrice;

    public Integer getSpeed(){
        return speed;
    }
    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public Double getRegularPrice(){
        return  regularPrice;
    }
    public void setRegularPrice(Double regularPrice){
        this.regularPrice = regularPrice;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Integer getSalePrice(){
        return salePrice;
    }
    public abstract void setSalePrice(Integer salePrice);
}