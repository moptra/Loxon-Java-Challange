package hu.progmasters.highschool;

public class Student extends Person{

    private String idNumber;
    private double gradePointsAverage;

    public Student(String name, int age, String gender, String idNumber, double gradePointsAverage) {
        super(name, age, gender);
        this.idNumber = idNumber;
        if (gradePointsAverage < 0) {
            this.gradePointsAverage = 0;
        } else {
            this.gradePointsAverage = gradePointsAverage;
        }
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGradePointsAverage() {
        return gradePointsAverage;
    }

    public void setGradePointsAverage(double gradePointsAverage) {
        if (gradePointsAverage < 0) {
            this.gradePointsAverage = 0;
        } else {
            this.gradePointsAverage = gradePointsAverage;
        }
    }

    public String toString() {
        return super.toString() + " ID Number: " + getIdNumber() + ", grade points average:" + getGradePointsAverage();
    }
}
