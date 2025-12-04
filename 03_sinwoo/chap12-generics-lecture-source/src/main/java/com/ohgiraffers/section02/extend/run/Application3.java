package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application3 {

    public static void main(String[] args) {

        WildCardFarm wcf = new WildCardFarm();

        // 생성자 매개 변수 타입을 보고 제네릭 타입 추론.
        /* <?> */
        wcf.anyType(new RabbitFarm<>(new Rabbit()));
        wcf.anyType(new RabbitFarm<>(new Bunny()));
        wcf.anyType(new RabbitFarm<>(new DrunkenBunny()));
        /* <? extends Bunny> */
        wcf.extendType(new RabbitFarm<>(new Bunny()));
        /* <? super Bunny> */
        wcf.superType(new RabbitFarm<>(new Rabbit()));
        wcf.superType(new RabbitFarm<>(new Bunny()));
        wcf.superType(new RabbitFarm<>(new DrunkenBunny()));



    }
}
