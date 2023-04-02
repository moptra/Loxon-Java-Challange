package human;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @Test
    void test_addGrade() {
        Teacher testTeacher = new Teacher("Test Teacher", 55);
        Student testStudent = new Student("Test Student",14);
        testTeacher.addGrade(testStudent,5);

        assertEquals(1, testStudent.getGrades().size());
        assertEquals(5,testStudent.getGrades().get(0));
    }
}