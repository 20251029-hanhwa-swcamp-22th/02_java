package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Bunny;
import com.ohgiraffers.section02.extend.MethodFarm;
import com.ohgiraffers.section02.extend.Rabbit;
import com.ohgiraffers.section02.extend.Snake;

import java.lang.reflect.Member;

public class Appplication2 {
    public static void main(String[] args) {

        MethodFarm farm = new MethodFarm();

        /* <T> 메서드 호출 -> 별도 제약없이 인자 전당 가능*/
        farm.animalType(new Bunny(), new Snake());
        farm.animalType(new String(), new Object());

        /* <T extends Mammal) 확인 */
        farm.mammalType(new Rabbit());

        /* <T extends Mammal) 확인 */
        farm.reptileType(new Snake());
        // farm.reptileType(new Rabbit());


    }
}
