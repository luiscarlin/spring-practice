package com.luchoc.domain;


public class Student {
    private Integer id;
    private String name;
    private String course;

    public Student(Integer id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}