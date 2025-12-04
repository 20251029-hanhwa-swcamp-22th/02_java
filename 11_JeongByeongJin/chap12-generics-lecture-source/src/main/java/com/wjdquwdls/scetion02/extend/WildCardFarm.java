package com.wjdquwdls.scetion02.extend;

public class WildCardFarm {

  /* 와일드 카드 ? 사용 */
  public void anyType(RabbitFarm<?> farm){
    // ? == Rabbit, Bunny, DrunkenBunny
    farm.getRabbit().cry();
  }

  public void extendType(RabbitFarm<? extends Bunny> farm){
    // ? == Bunny 또는 Bunny 후손 클래스
    farm.getRabbit().cry();
  }

  public void superType(RabbitFarm<? super Bunny> farm){
    // ? == Bunny 또는 Rabbit
    farm.getRabbit().cry();
  }
}
