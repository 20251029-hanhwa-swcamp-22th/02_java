package com.ohgiraffers.section02.extend;

public class WildCardFarm {
  /* 와일드 카드 ? 사용 */
  public void anyType(RabbitFarm<?> farm){
    // ? == Rabbit, Bunny, DrunkenBunny
    farm.getRabbit().cry();
  }
  //이거 왜 물음표가 이 세개인지 모르겟어..

  public void extendType(RabbitFarm<? extends Bunny> farm){
    // ? == Bunny 또는 Bunny 후손 클래스
    farm.getRabbit().cry();
  }

  public void superType(RabbitFarm<? super Bunny> farm){
    // ? == Bunny 또는 Bunny 부모 클래스(Rabbit)
    farm.getRabbit().cry();
  }
}
