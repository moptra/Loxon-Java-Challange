package hu.progmasters.highschool;

public class Teacher extends Person{

    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        this.subject = subject;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + " salary: " + getSalary() + ", subject: " + getSubject();
    }
}
