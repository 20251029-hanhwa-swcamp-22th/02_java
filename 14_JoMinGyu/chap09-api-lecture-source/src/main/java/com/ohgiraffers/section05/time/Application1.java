package com.ohgiraffers.section05.time;

import java.util.Date;

public class Application1 {
  public static void main(String[] args) {

    Date today = new Date();
    System.out.println("today = " + today);

    Date date = new Date(0L);
    System.out.println("date = " + date);


  }
}
