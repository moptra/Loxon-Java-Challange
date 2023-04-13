package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<Integer> grades;


    public Student(String name, int age, List<Integer> grades) {
        this.name = name;
        this.grades = grades;

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    //


    public Student(int age, String name, List<Integer> grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public Student() {
    }

    public void addGrade(Integer grade) {
        grades.add(grade);
    }
    // az objektum listájához rak hozzá egy értéket


    public void setName(String name) {
        this.name = name;
    }
    // this nélkül is lefut, csak a paramétert máshogyan kell elneveznünk!!!!
    //minidg az adott objektumra mutat, amire meghívtuk a metódust (Lacira)


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.grades;
    }
}
