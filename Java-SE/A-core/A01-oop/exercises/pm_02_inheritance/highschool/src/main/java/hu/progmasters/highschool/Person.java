package hu.progmasters.highschool;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

        if (gender == "F" || gender == "M") {
            this.gender = gender;
        } else {
            this.gender = "unknown";
        }
    }

    public Person() {
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "F" || gender == "M") {
            this.gender = gender;
        }
        this.gender = "unknown";
    }

    public String toString(){
        return "Name: " + name + ", age: " + age + " gender: " + gender;
    }

}
