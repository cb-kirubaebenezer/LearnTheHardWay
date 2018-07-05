package day2.model;
import utilities.*;
import day2.interfaces.*;
import day2.*;
public class Mammal implements IBehaviour{
    private String species;
    private String gender;
    private Integer age;
    private String foodHabit;

    public Mammal(String species,String gender){
        this.species = species;
        this.gender = gender;
    }
    public Mammal(String species, String gender, Integer age, String foodHabit){
        this(species,gender);
        this.age = age;
        this.foodHabit = foodHabit;
    }
    public String getSpecies(){
        return species;
    }
    public String getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    public String getFoodHabit(){
        return foodHabit;
    }

    public void eat(){
        try {
            UtilityMethods.print("Yaas. All mammals have to eat");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void speak(){
        try {
            UtilityMethods.print("Naah Naah. Speaking ain't a thing here.");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
    public void walk(){
        try {
            UtilityMethods.print("Yaas. Walk Errhhh....");
        } catch (Exception e) {
            UtilityMethods.print(e.getMessage());
        }
    }
}