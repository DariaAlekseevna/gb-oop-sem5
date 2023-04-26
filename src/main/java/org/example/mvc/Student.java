package org.example.mvc;

public class Student extends User {
    private String group;

    @Override
    public String toString() {
        return "Student: " +
                "group = " + group +
                ", name = " + name +
                ", age = " + age;
    }

    public Student(String name, Integer age, String group) {
        super(name, age);
        this.group = group;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void info() {
        System.out.println("Student: "+ super.name + ", Age: " + super.age +", Group: " + group);
    }
}
