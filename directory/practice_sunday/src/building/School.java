package building;

import human.Student;
import human.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School extends Building {

    private List<Teacher> teachers;
    private List<Student> students;


    public School(String name, int area, int numberOfFloors) {
        super(name, area, numberOfFloors);
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public School(String name, int area, int numberOfFloors, List<Teacher> teachers, List<Student> students) {
        super(name, area, numberOfFloors);
        this.teachers = teachers;
        this.students = students;
    }
}
