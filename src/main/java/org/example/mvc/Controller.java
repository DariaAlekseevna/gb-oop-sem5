package org.example.mvc;

public class Controller {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 19, "a-15");
        UserService userService = new UserService();
        StudentData studentData = new StudentData();
        userService.create(student1, studentData.getStudentList());
        userService.read(studentData.getStudentList());
        StudentView stView = new StudentView();
        stView.view(student1);
        TeacherView teacherView = new TeacherView();
        teacherView.view();
        teacherView.view(student1);
    }
}
