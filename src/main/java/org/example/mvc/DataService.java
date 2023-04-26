package org.example.mvc;

import java.util.List;

public interface DataService {
    void create(Student student, List<Student> studentList);

    void read(List<Student> studentList);
}
