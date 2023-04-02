package hu.progmasters.highschool;

public class Main {

    public static void main(String[] args) {
        Person agi = new Person("Ági", 25, "q");
        System.out.println(agi);

        Teacher geza = new Teacher("Géza", 34, "M", 280000, "math");
        System.out.println(geza);

        Student laci = new Student("Laci", 16, "M", "022010", 4.2);
        System.out.println(laci);

        CollageStudent noemi = new CollageStudent("Noémi", 23, "F", "110403",
                4.6, 2020, "literature");
        System.out.println(noemi);
    }
}

