package human;

public class Teacher extends Human {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void addGrade(Student student, Integer grade) {
        student.getGrades().add(grade);
    }
}
