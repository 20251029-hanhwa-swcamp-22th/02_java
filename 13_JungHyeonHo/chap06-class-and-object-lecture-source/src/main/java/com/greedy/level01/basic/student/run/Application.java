package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    StudentDTO[] students = new StudentDTO[10];
    int now=0;
    Scanner sc = new Scanner(System.in);
    String input = "y";
    while (input.equals("y")) {
      System.out.print("학년 : ");
      int grade = Integer.parseInt(sc.nextLine());
      System.out.print("반 : ");
      int classroom = Integer.parseInt(sc.nextLine());
      System.out.print("이름 : ");
      String name = sc.nextLine();
      System.out.print("국어점수 : ");
      int kor = Integer.parseInt(sc.nextLine());
      System.out.print("영어점수 : ");
      int eng = Integer.parseInt(sc.nextLine());
      System.out.print("수학점수 : ");
      int math = Integer.parseInt(sc.nextLine());
      try{students[now++]=new StudentDTO(grade,classroom,name,kor,eng,math);}
      catch (ArrayIndexOutOfBoundsException e){
        System.err.println("배열 값 넘겼어요");e.printStackTrace();}
      System.out.print("계속 추가할 겁니까 ? (y/n) : ");
      input = sc.nextLine();
    }
    Arrays.stream(students).filter(Objects::nonNull).forEach(s -> System.out.println(s.getInformation()));
  }

}
