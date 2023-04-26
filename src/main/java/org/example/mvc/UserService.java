package org.example.mvc;

import java.util.List;

public class UserService implements DataService {
    @Override
    public void create(Student student, List<Student> studentList) {
        studentList.add(student);
    }

    @Override
    public void read(List<Student> studentList) {
        System.out.println(studentList.toString());
    }
}
