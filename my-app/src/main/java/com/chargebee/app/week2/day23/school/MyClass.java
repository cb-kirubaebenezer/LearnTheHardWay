
package com.chargebee.app.week2.day23.school;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyClass {

    @SerializedName("Student")
    @Expose
    private Student student;
    @SerializedName("Teacher")
    @Expose
    private Teacher teacher;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}