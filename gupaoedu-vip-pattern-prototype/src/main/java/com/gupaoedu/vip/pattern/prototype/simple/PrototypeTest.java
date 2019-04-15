package com.gupaoedu.vip.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcreatePrototypeA concreatePrototypeA = new ConcreatePrototypeA();
        concreatePrototypeA.setName("TOM");
        concreatePrototypeA.setAge(18);
        List<String> hobies = new ArrayList<>();
        hobies.add("basketball");
        hobies.add("football");
        concreatePrototypeA.setHobies(hobies);
        Course course = new Course();
        course.setCourse("Java");
        concreatePrototypeA.setCourse(course);
//
//        ConcreatePrototypeA copy = (ConcreatePrototypeA)concreatePrototypeA.clone();
//
//        System.out.println(concreatePrototypeA.getCourse());
//        System.out.println(copy.getCourse());
//
//        System.out.println(concreatePrototypeA.getHobies() == copy.getHobies());
//        System.out.println(concreatePrototypeA.getCourse() == copy.getCourse());

        Clint clint = new Clint();
        ConcreatePrototypeA copy = (ConcreatePrototypeA)clint.startClone(concreatePrototypeA);
        System.out.println("原对象中引用类型地址的值：" + concreatePrototypeA.getCourse());
        System.out.println("克隆对象中引用类型地址的值：" + copy.getCourse());
        System.out.println("对象地址值比较：" + (concreatePrototypeA.getCourse() == copy.getCourse()));

    }
}
