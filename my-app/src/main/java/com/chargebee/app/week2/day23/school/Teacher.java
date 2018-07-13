
package com.chargebee.app.week2.day23.school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {

    private List<String> classesTakingCareOf = null;
    private String dateOfJoining;
    private String iD;
    private String name;
    private Integer salary;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
