package com.ohgiraffers.level01.basic.student.run;

import com.ohgiraffers.level01.basic.student.model.dto.StudentDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentList = new StudentDTO[10];

        String input = "";
        int index = 0;
        while(input != "n" && index < 10) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            studentList[index] = new StudentDTO(classroom, eng, grade, kor, math, name);
            index++;

            System.out.print("계속 추가할 겁니까 ? (Y/N) : ");
            input = sc.next().toLowerCase();
            if (input.equals("n")){
                System.out.println("-----------입력생략--------------");
                break;
            }

        }

        for (int i=0; i<index; i++) {
            System.out.println(studentList[i]);
        }

    }

}
