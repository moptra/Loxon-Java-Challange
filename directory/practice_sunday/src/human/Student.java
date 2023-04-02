package human;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human implements CanPrintDetails {

    private List<Integer> grades = new ArrayList<>();
    private static final String SEPARATOR = System.lineSeparator();

    public Student(String name, int age) {
        super(name, age);
    }

    public double calculateAverage() {
        int count = 0;
        for (Integer grade : grades) {
            count += grade;
        }
        return (double) count / grades.size();
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public void printDetails() {
        System.out.print("Name: " + name + SEPARATOR +
                "Age: " + age + SEPARATOR +
                name + "'s average: " + calculateAverage());
    }
}
