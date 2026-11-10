
package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService service = new StudentService();

    @Test
    void testGradeA() {
        assertEquals("A", service.getStudentGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", service.getStudentGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", service.getStudentGrade(65));
    }

    @Test
    void testFail() {
        assertEquals("Fail", service.getStudentGrade(20));
    }

    @Test
    void testInvalidMarks() {
        assertEquals("Invalid Marks", service.getStudentGrade(110));
    }

    @Test
    void testTotal() {
        assertEquals(150, service.calculateTotal(70, 80));
    }
}
