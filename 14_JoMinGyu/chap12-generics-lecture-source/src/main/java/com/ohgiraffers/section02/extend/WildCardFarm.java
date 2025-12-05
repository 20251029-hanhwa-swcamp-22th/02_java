package com.ohgiraffers.section02.extend;

public class WildCardFarm {

  /* 와일드 카드 ? 사용 */
  public void anyType(RabbitFarm<?> farm) {
    // ? == RabbitFarm에 들어갈 수 있는 모든 클래스
    farm.getRabbit().cry();
  }

  public void extendType(RabbitFarm<? extends Bunny> farm) {
    // ? == Bunny 또는 Bunny 후손 클래스
    farm.getRabbit().cry();
  }

  public void superType(RabbitFarm<? super Bunny> farm) {
    // ? == Bunny 자신 or 부모 클래스
    // RabbitFarm 클래스 제약조건 때문에 Rabbit의 위로는 안된다
    farm.getRabbit().cry();
  }
}
