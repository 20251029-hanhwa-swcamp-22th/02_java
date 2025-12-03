package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application3 {
  public static void main(String[] args) {
    WildCardFarm wf = new WildCardFarm();

    /* 생성자 매개변수 타입 보고 제네릭 타입을 추론 */
    wf.anyType(new RabbitFarm<>(new Rabbit()));
    wf.anyType(new RabbitFarm<>(new Bunny()));
    wf.anyType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? extend Bunny>*/
    //wf.extendType(new RabbitFarm<>(new Rabbit()));
    wf.extendType(new RabbitFarm<>(new Bunny()));
    //wf.extendType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? super Bunny>
    * 추론 상태일때는 잘됨... 다형성까지 생각해서 추론해줌
    * 근데 명시해주면 다형성 안돼서 안되는???거래 */
    wf.superType(new RabbitFarm<>(new Rabbit()));
    wf.superType(new RabbitFarm<>(new Bunny()));
    wf.superType(new RabbitFarm<>(new DrunkenBunny())); //업캐스팅
    //wf.superType(new RabbitFarm<Rabbit>(new DrunkenBunny())); -> 이상태인거라 됨!!
    //wf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
  }
}
