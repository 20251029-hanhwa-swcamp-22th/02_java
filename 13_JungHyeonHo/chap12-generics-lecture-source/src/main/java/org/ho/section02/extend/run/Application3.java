package org.ho.section02.extend.run;

import org.ho.section02.extend.*;

public class Application3 {
  public static void main(String[] args) {
    WildCardFarm wf = new WildCardFarm();
//    wf.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
//    생성자 매개 변수 타입을 보고 제네릭 타입 추론
    wf.anyType(new RabbitFarm<>(new Rabbit()));
    wf.anyType(new RabbitFarm<>(new Bunny()));
    wf.anyType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? extend Bunny> */
//    wf.extendType(new RabbitFarm<>(new Rabbit()));
    wf.extendType(new RabbitFarm<>(new Bunny()));
//    wf.extendType(new RabbitFarm<>(new DrunkenBunny()));

    /* <? super Bunny> */
    wf.superType(new RabbitFarm<>(new Rabbit()));
    wf.superType(new RabbitFarm<>(new Bunny()));
    wf.superType(new RabbitFarm<>(new DrunkenBunny()));
//    wf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
//    => 위의 DrunkenBunny()는 자동으로 업캐스팅 된거임. 근데 주석처리된 문장은 자동업캐스팅을 막음. 오류발생.
  }
}
