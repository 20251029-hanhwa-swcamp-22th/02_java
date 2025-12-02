package com.mycompany.section02.extend;

public class MethodFarm {

  /* 메서드에 제네릭 적용 */
  public <T> void animalType(T t1, T t2){}

  public <T extends Mammal > void mammalType(T t1){}

  public <T extends Reptile > void reptileType(T t1){}





}


