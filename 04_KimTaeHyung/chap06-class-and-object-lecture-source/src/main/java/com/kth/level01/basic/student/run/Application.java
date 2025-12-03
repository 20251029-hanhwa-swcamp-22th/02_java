package com.kth.level01.basic.student.run;

import com.kth.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StudentDTO[] members = new StudentDTO[10];

    int count = 0;

    while ( count < members.length ) {
      System.out.print("학년 : ");
      int grade = sc.nextInt();

      System.out.print("반 : ");
      int classroom = sc.nextInt();

      sc.nextLine();

      System.out.print("이름 : ");
      String name = sc.nextLine();

      System.out.print("국어점수 : ");
      int kor = sc.nextInt();

      System.out.print("영어점수 : ");
      int eng = sc.nextInt();

      System.out.print("수학점수 : ");
      int math = sc.nextInt();

      // 한 명의 학생 정보를 StudentDTO 객체에 저장
      members[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

      count++;

      System.out.print("계속 추가할 겁니까? (y/n) : ");
      sc.nextLine();
      char answer = sc.nextLine().charAt(0);

      if (answer == 'n' ||  answer == 'N') {break;}
    }

    for(int i = 0; i < count; i++){
      System.out.println(members[i].getInformation());
    }

  }
}
