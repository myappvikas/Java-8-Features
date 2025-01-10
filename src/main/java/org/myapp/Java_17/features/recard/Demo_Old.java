package org.myapp.Java_17.features.recard;

import java.util.Objects;

class Student{
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Demo_Old {

    public static void main(String[] args) {

        Student student_1 = new Student(1,"vikas");
        Student student_2 = new Student(1,"vikas");
        System.out.println(student_1.equals(student_2));
    }
}
