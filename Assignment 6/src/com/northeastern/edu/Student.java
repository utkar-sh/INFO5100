package com.northeastern.edu;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student(int id, String name, double gpa, Date dateOfBirth){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth= dateOfBirth;


    }

}
