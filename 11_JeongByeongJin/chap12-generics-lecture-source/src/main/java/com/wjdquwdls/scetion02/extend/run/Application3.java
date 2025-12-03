package com.wjdquwdls.scetion02.extend.run;

import com.wjdquwdls.scetion02.extend.*;

public class Application3 {
  public static void main(String[] args) {
    WildCardFarm wf = new WildCardFarm();

    // 생성자 매개 변수타입을 보고 제네릭 타입 추론
    wf.anyType(new RabbitFarm<>(new Rabbit()));
    wf.anyType(new RabbitFarm<>(new Bunny()));
    wf.anyType(new RabbitFarm<>(new DrunkenBunny()));

//    wf.extendType(new RabbitFarm<Rabbit>(new Rabbit()));
    wf.extendType(new RabbitFarm<>(new Bunny()));
//    wf.extendType(new RabbitFarm<Rabbit>(new DrunkenBunny()));

    wf.superType(new RabbitFarm<>(new Rabbit()));
    wf.superType(new RabbitFarm<>(new Bunny()));
    wf.superType(new RabbitFarm<>(new DrunkenBunny()));

  }
}
