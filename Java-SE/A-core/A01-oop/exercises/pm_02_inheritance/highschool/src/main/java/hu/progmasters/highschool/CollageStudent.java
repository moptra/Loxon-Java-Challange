package hu.progmasters.highschool;

public class CollageStudent extends Student {

    private int year;
    private String major;

    public CollageStudent(String name, int age, String gender, String idNumber,
        double gradePointsAverage, int year, String major) {
        super(name, age, gender, idNumber, gradePointsAverage);
        if (year < 0) {
            this.year = 0;
        } else {
            this.year = year;
        }
        this.major = major;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + " year: " + getYear() + ", major: " + getMajor();
    }
}
