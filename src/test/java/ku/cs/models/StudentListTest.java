package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
        studentList.addNewStudent("01", "uwu", 49.9);
        studentList.addNewStudent("02", "owo", 80.5);
    }

    @Test
    void testFindStudentById() {
        Student student = studentList.findStudentById("01");
        assertEquals("uwu", student.getName());
    }

    @Test
    void testAddNewStudentNoScore() {
        Student temp;
        studentList.addNewStudent("03", "amogus");

        temp = studentList.findStudentById("03");
        assertEquals("amogus", temp.getName());
    }

    @Test
    void testAddNewStudentWithScore() {
        Student temp;
        studentList.addNewStudent("03", "amogus", 59.9);

        temp = studentList.findStudentById("03");
        assertEquals("amogus", temp.getName());
        assertEquals(59.9, temp.getScore(), 1e-9);
    }

    @Test
    void testViewGradeOfId() {
        assertEquals("F", studentList.viewGradeOfId("01"));
        assertEquals("A", studentList.viewGradeOfId("02"));
    }
}