
package com.chargebee.app.week2.day23.school;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teacher {

    @SerializedName("Classes Taking Care Of")
    @Expose
    private List<String> classesTakingCareOf = null;
    @SerializedName("Date Of Joining")
    @Expose
    private String dateOfJoining;
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Salary")
    @Expose
    private Integer salary;

    public List<String> getClassesTakingCareOf() {
        return classesTakingCareOf;
    }

    public void setClassesTakingCareOf(List<String> classesTakingCareOf) {
        this.classesTakingCareOf = classesTakingCareOf;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}