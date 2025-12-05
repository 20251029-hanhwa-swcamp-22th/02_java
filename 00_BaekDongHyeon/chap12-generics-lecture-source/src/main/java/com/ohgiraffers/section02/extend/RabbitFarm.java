package com.ohgiraffers.section02.extend;

// RabbitFarm 인스턴스 생성 시
// Rabbit 또는 Rabbit을 상속 받은 자식 타입으로만 생성 가능
public class RabbitFarm <T extends Rabbit>{
  private T rabbit;

  public RabbitFarm(){}

  public RabbitFarm(T rabbit){
    this.rabbit = rabbit;
  }

  public T getRabbit() {
    return rabbit;
  }

  public void setRabbit(T rabbit) {
    this.rabbit = rabbit;
  }
}
