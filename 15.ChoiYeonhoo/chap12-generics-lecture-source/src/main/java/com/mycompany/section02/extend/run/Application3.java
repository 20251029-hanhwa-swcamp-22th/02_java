package com.mycompany.section02.extend.run;

import com.mycompany.section02.extend.*;

public class Application3 {
  public static void main(String[] args) {

    WildCardFarm wf = new WildCardFarm();

    // 생성자 매개 변수 타입을보고 제네릭 타입을 추론함
    wf.aniType(new RabbitFarm</*Rabbit*/>(new Rabbit()));
    wf.aniType(new RabbitFarm<>(new Bunny()));
    wf.aniType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? extends Bunny> */
//    wf.extendType(new RabbitFarm<>(new Rabbit()));
    wf.extendType(new RabbitFarm<>(new Bunny()));
//    wf.extendType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? super Bunny> */
    wf.superType(new RabbitFarm<>(new Rabbit()));
    wf.superType(new RabbitFarm<>(new Bunny()));
    wf.superType(new RabbitFarm<Rabbit>(new DrunkenBunny()));// 추론 상태일 땐, DrunkenBunny의 부모가 Rabbit이여서 DrunkenBunny를 Rabbit으로 업캐스팅해서 문제가 없음
//    wf.superType(new RabbitFarm<Bunny>(new DrunkenBunny())); // 이처럼 추론하지 않고 위처럼 추론함
//    wf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); // 그러나 명시하게 되면 superType()의 RabbitFarm에는 DrunkenBunny가 들어갈수 없으므로, 에러가 발생


  }
}
