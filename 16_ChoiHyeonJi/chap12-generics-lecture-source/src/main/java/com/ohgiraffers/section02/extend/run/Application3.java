package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application3 {
  public static void main(String[] args) {
    WildCardFarm wf = new WildCardFarm();

    wf.anyType(new RabbitFarm<>(new Rabbit())); // new 옆 생성자
    wf.anyType(new RabbitFarm<>(new Bunny()));
    wf.anyType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? extend Rabbit> */
   // wf.extendType(new RabbitFarm<>(new Rabbit()));
    wf.extendType(new RabbitFarm<>(new Bunny()));
   // wf.extendType(new RabbitFarm<>(new DrunkenBunny()));


    //alt shift

    wf.superType(new RabbitFarm<>(new Rabbit()));
    wf.superType(new RabbitFarm<>(new Bunny()));
    wf.superType(new RabbitFarm<>(new DrunkenBunny()));
    //wf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

  }
}
