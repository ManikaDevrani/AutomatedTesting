
package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceIntegrationTest {

    @Test
    void testCompleteStudentResult() {

        StudentService service = new StudentService();

        int total = service.calculateTotal(95, 90);
        String grade = service.getStudentGrade(total / 2);

        assertEquals(185, total);
        assertEquals("A", grade);
    }

    @Test
    void testStudentFailResult() {

        StudentService service = new StudentService();

        int total = service.calculateTotal(20, 30);
        String grade = service.getStudentGrade(total / 2);

        assertEquals(50, total);
        assertEquals("Fail", grade);
    }
}
