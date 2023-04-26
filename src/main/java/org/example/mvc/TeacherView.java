package org.example.mvc;

public class TeacherView {
    public void view(Student student) {
        StudentData std = new StudentData();
        for (Student st: std.getStudentList()) {
            if (st.equals(student)){
                System.out.println(st.toString());
            }
        }
    }
    public void view() {
        StudentData std = new StudentData();
//        for (Student st: std.getStudentList()) {
//                System.out.println(st.toString());
//        }
        System.out.println(std.getStudentList().toString());
    }
}
