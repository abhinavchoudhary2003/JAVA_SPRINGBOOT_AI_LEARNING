package com.cfs.web;

// we need student class here because In frontend we provide only structure , but in backend we can't write like this we need logic and in java application we need classes to store or hold  student data that we write in index.html
public class Student {
public  final String username;
public  final String rollno;
public final String  course;
public  final int marks;

    public Student(String username, String rollno, String course, int marks) {
        this.username = username;
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
    }

    public String getUsername() {
        return username;
    }

    public String getRollno() {
        return rollno;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", rollno='" + rollno + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}
