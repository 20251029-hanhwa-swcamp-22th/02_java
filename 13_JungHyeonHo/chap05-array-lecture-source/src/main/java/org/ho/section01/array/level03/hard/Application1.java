package org.ho.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("홀수인 양의 정수를 입력하세요 : ");
    int input = sc.nextInt();

    // 음수 + 0 + 짝수
    if(input <= 0 || input%2 == 0){
      System.out.println("양수 혹은 홀수만 입력해야 합니다.");
      return;
    }


    int[] iarr = new int[input];

    int mid= iarr.length/2;
    for (int i = 0; i <= mid; i++) {
      iarr[i]=i+1;
      iarr[input-1-i]=iarr[i];
    }
    for (int num : iarr){
      System.out.print(num + " ");
    }
  }
}
