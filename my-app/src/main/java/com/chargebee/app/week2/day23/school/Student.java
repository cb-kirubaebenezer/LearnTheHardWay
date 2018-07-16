
package com.chargebee.app.week2.day23.school;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("Date Of Joining")
    @Expose
    private String dateOfJoining;
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Marks")
    @Expose
    private List<Mark> marks = null;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Std")
    @Expose
    private String std;

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

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

}