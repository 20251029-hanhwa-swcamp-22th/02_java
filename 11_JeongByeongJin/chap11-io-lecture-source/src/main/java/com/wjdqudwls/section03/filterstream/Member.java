package com.wjdqudwls.section03.filterstream;

public class Member implements java.io.Serializable {

  private String id;
  private String pwd;
  private int age;
  private char gender;

  public Member(String id, String pwd, int age, char gender) {
    this.id = id;
    this.pwd = pwd;
    this.age = age;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Member{" +
        "id='" + id + '\'' +
        ", pwd='" + pwd + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        '}';
  }
}