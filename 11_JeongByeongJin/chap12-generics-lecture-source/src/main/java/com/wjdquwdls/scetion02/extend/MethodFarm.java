package com.wjdquwdls.scetion02.extend;

public class MethodFarm {

  /* 메서드 매개 변수에 제네릭 적용 */
  public <T> void animalType(T t1, T t2){}

  public <T extends Mammal> void MammalType(T t){}

  public <T extends Reptile> void MammalType(T t){}
}
