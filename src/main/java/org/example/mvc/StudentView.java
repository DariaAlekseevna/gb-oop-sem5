package org.example.mvc;

public class StudentView {

    public void view(Student student) {
        StudentData std = new StudentData();
        for (Student st: std.getStudentList()) {
            if (st.equals(student)){
                System.out.println(st.toString());;
            }
        }
    }
}
