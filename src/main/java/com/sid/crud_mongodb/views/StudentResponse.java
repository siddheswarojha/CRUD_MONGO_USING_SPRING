package com.sid.crud_mongodb.views;

import com.sid.crud_mongodb.Model.Student;

public class StudentResponse {
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    private int roll;
    private String name;
    private String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public StudentResponse(Student student){
        this.branch = student.getBranch();
        this.name = student.getName();
        this.roll=student.getRoll();
    }
}
