package com.ohgiraffers.section00.homework;

import java.util.Scanner;

public class ClassAndObject1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        while (count < 10) {

            System.out.print("학년");
            int grade = sc.nextInt();

            System.out.print("반");
            int classroom = sc.nextInt();

            sc.nextLine();

            System.out.print("이름");
            String name = sc.nextLine();

            System.out.print("국어점수");
            int kor = sc.nextInt();

            System.out.print("영어점수");
            int eng = sc.nextInt();

            System.out.print("수학점수");
            int math = sc.nextInt();

            sc.nextLine();


            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;


            System.out.print("계속추가할거면 y 아니면 n (y/n) : ");
            String answer = sc.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                break;
            }

            System.out.println();
        }
        System.out.println("=====학생 정보 =====");

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].Information());
        }
    }
}
