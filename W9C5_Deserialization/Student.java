package W9C5_Deserialization;

import SerializationUtils.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Student implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private double grade;
    private int id;

    public Student(String name, double grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Name: " + name + " grade:  " + grade + " id " + id;
    }

    public static void main(String[] args) {
        Student olivia = new Student("Olivia", 5, 121213);
        Student max = new Student("Max", 4, 12323413);
        Student kim = new Student("Kim", 2, 2323);

        Student[] students = {olivia, max, kim};

        String filename = "students.out";

        try {
            SerializationUtils.serialize(students, filename);
            Student[] deserializedStudents = (Student[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(deserializedStudents));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        }

    }


