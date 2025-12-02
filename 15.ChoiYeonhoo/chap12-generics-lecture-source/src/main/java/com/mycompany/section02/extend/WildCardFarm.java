package com.mycompany.section02.extend;

public class WildCardFarm {

  /* 와일드 카드 ? 사용 */
  public void aniType(RabbitFarm<?> farm){
    // ? == Rabbit, Bunny, DrunkenBunny
    farm.getRabbit().cry();
  }

  public void extendType(RabbitFarm<? extends Bunny> farm){
    // ? = Bunny 또는 Bunny의 자식 클래스
    farm.getRabbit().cry();
  }

  public void superType(RabbitFarm<? super Bunny> farm){
    // ? = Bunny 또는 Bunny의 부모 클래스인 Rabbit
    // 기본적으로 RabbitFarm<?>이 Rabbit, Bunny, DrunkenBunny 까지만 되므로, Mammal이나, Animal, Object가 안됨
    // 만약 RabbitFarm 클래스에서 <T extends Rabbit> 이라는 제약조건이 없었으면 다 되었을것
    farm.getRabbit().cry();
  }
}
