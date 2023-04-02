import building.School;
import human.Student;
import human.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

/*        Modellezzük le egy iskola és kórház alapszintű működését. Tároljunk mindent rendszerezetten!

                Mire lesz szükségünk az iskolában?
        - iskolaépületre (név, alapterület, szintek száma, tanárok, diákok)
                - diákokra, tanárokra (név, kor), de a diákoknak legyen osztályzatuk is
        A programunk tudja számolni a diákok osztályzatainak átlagát, ki tudja írni azoknak rendezett formában az adatait.
                A tanárok pedig képesek arra, hogy újabb osztályzatot írjanak be a diákoknak.

        Mire lesz szükségünk a kórházban?
                - kórházépületre (név, alapterület, szintek száma, betegek, orvosok)
                        - betegekre, orvosokra (név, kor), de a betegeknél szeretnénk tárolni azt is, hogy meggyógyultak-e már
        A programunk ki tudja írni rendezett formában a betegek adatait.
        Az orvosok pedig képesek arra, hogy a betegek státuszát megváltoztassák (gyógyult vagy sem).*/

/*        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("xx",9));
        List<Teacher> teacherlist = new ArrayList<>();
        School school1 = new School("school", 5000, 3);
        School school2 = new School("school", 5000, 3, teacherlist,studentList);*/

        Student bela = new Student("Béla", 18);
        Student ervin = new Student("Ervin", 20);
        Teacher teacher = new Teacher("Teacher", 48);

        teacher.addGrade(bela,5);
        teacher.addGrade(bela,1);
        teacher.addGrade(ervin,1);

    }
}
