
package com.student;

public class StudentService {

    public String getStudentGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public int calculateTotal(int marks1, int marks2) {
        return marks1 + marks2;
    }
}
