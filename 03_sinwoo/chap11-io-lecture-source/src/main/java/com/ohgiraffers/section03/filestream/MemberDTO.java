package com.ohgiraffers.section03.filestream;

public class MemberDTO {
    String user;
    String pass;
    String name;
    String mail;
    int age;
    char gender;
    double salary;
    public MemberDTO(String user01, String pass01, String name, String mail, int i, char gender, double v) {
        this.user = user01;
        this.pass = pass01;
        this.name = name;
        this.mail = mail;
        this.age = i;
        this.gender = gender;
        this.salary = v;
    }
}
