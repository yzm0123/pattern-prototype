package com.gupaoedu.vip.pattern.prototype.simple;

import java.util.List;

public class ConcreatePrototypeA implements Prototype {

    private String name;
    private int age;
    private List<String> hobies;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobies() {
        return hobies;
    }

    public void setHobies(List<String> hobies) {
        this.hobies = hobies;
    }

    @Override
    public Prototype clone() {

        ConcreatePrototypeA copy = new ConcreatePrototypeA();
        copy.setAge(this.age);
        copy.setName(this.name);
        copy.setHobies(this.hobies);
        copy.setCourse(this.course);
        return copy;
    }
}
