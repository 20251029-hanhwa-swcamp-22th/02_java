package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application3 {
    public static void main(String[] args) {
        WildCardFarm wf = new WildCardFarm();

        wf.anyType(new RabbitFarm<>(new Rabbit()));
        wf.anyType(new RabbitFarm<>(new DrunkenBunny()));
        wf.anyType(new RabbitFarm<>(new Bunny()));

        /*<? extend Bunny>*/
        //wf.extendType(new RabbitFarm<>(new Rabbit()));
        //wf.extendType(new RabbitFarm<>(new DrunkenBunny()));
        wf.extendType(new RabbitFarm<>(new Bunny()));

        wf.superType(new RabbitFarm<>(new Rabbit()));
        wf.superType(new RabbitFarm<>(new Bunny()));
        wf.superType(new RabbitFarm<>(new DrunkenBunny()));
       /* wf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        DrunkenBunny 랑 Bunny 둘다 Rabbit을 부모로 두기때문에
                <> 칸을 비어둬도 */

    }


}
