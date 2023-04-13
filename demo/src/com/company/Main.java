package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final Student marika = new Student(); //ehhez kell egy paraméter nélküli konstruktor
        System.out.println(marika.getName());
        marika.setName("Marika");
        System.out.println(marika.getName());
        marika.setAge(-98);

        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(4);
        grades.add(5);

        Student ervin = new Student("Ervin", 16, grades);

        Student laci = new Student(17, "Laci", grades);

        //System.out.println(laci.name);

        laci.addGrade(5);

        //System.out.println(laci.grades);

        laci.setName("Károly");
        laci.setAge(-87);
        System.out.println(laci.getAge());
        laci.setAge(18);
        System.out.println(laci.getAge());


        //laci.age = -8;

        System.out.println(laci.toString());
        System.out.println(laci);

        final int NUMBER = 5;
        // NUMBER = 8; --> nem lehetséges
        marika.setName("Klári");
        //név megváltoztatható, de a referencia nem ha marika final-re lett állítva
    }
}