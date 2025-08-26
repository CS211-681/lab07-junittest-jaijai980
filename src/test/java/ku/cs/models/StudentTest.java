package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("6710405184", "Wachirawit Methawirune");
        student.addScore(40.5);
    }

    @Test
    void testAddScore() {
        student.addScore(10.6);
        assertEquals(51.1, student.getScore(), 1e-9);
    }

    @Test
    void testGradeA() {
        student.addScore(39.5);
        assertEquals("A", student.grade());
    }

    @Test
    void testGradeB() {
        student.addScore(39.4);
        assertEquals("B", student.grade());
    }

    @Test
    void testChangeName() {
        student.changeName("uwu owo");
        assertEquals("uwu owo", student.getName());
    }

    @Test
    void testIsId() {
        assertEquals("6710405184", student.getId());
    }

    @Test
    void testIsNameContainsTrue() {
        assertTrue(student.isNameContains("wachi"));
    }

    @Test
    void testIsNameContainsFalse() {
        assertFalse(student.isNameContains("uwu"));
    }

    @Test
    void testGetId() {
        assertEquals("6710405184", student.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Wachirawit Methawirune", student.getName());
    }

    @Test
    void testGetScore() {
        assertEquals(40.5, student.getScore(), 1e-9);
    }

    @Test
    void testGetGrade() {
        assertEquals("F", student.getGrade());
    }
}