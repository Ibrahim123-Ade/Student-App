package com.example.mystudentloginapp.entities;

import java.io.File;

public class Student {
    private int userId;

    private String name;

    private String department;

    private String faculty;

    private File picture;

    private String classs;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public Student(int userId, String name, String department, String faculty, File picture, String classs) {
        this.userId = userId;
        this.name = name;
        this.department = department;
        this.faculty = faculty;
        this.picture = picture;
        this.classs = classs;


    }
}
