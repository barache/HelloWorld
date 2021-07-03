package com.javalearn;

public class Student {
    private int studentCode;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private address address;

    public Student() {
    }

    public Student(int studentCode, String firstName, String lastName, String email, String phone, com.javalearn.address address) {
        this.studentCode = studentCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public com.javalearn.address getAddress() {
        return address;
    }

    public void setAddress(com.javalearn.address address) {
        this.address = address;
    }
}
