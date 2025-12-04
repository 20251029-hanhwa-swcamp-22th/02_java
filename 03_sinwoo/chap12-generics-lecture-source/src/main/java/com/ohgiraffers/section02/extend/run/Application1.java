package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        /* Extends 키워드를 이용한 제네릭 타입 범위 제한 */
        /* Supertype 또는 관련 없는 type으로 인스턴스 생성 불가능 */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();
//        RabbitFarm<Reptile> farm1 = new RabbitFarm<Reptile>();

        /* Rabbit 또는 후손 타입으로 인스턴스 생성 가능 */
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>(); // <> == type 추론.

        farm1.setRabbit(new Rabbit());
        farm2.setRabbit(new Bunny());
        farm3.setRabbit(new DrunkenBunny());

        farm1.getRabbit().cry();
        farm2.getRabbit().cry();
        farm3.getRabbit().cry();

    }
}
