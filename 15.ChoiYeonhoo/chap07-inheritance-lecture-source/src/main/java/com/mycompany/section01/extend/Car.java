package com.mycompany.section01.extend;

public class Car {

  /* 생성자 */
  public Car(){
    System.out.println("Car 기본 생성자 호출됨");
  }

  /* 메소드*/
  private boolean runningStatus;

  public void run(){
    runningStatus = true;
    System.out.println("자동차가 달린다.");
  }

  public void stop(){
    runningStatus = false;
    System.out.println("자동차가 멈춘다");
  }

  public void soundHorn() {
    if (runningStatus) {
      System.out.println("빵,빵");
    } else {
      System.out.println("주행 중이 아닙니다.");
    }
  }
}
