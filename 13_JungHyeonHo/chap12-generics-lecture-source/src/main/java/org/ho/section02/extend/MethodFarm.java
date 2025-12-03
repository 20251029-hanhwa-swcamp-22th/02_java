package org.ho.section02.extend;

public class MethodFarm{

  /* 메서드에 제네릭 적용 */
  public <T> void animalType(T t1, T t2) {} // 호출 시점에 타입이 결정
  public <T extends Mammal> void mammalType(T t) {}
  public <T extends Reptile> void repTileType(T t) {}

}
