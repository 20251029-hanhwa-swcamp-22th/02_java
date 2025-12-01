package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Bunny;
import com.ohgiraffers.section02.extend.MethodFarm;
import com.ohgiraffers.section02.extend.Snake;

import javax.swing.*;

public class Application2 {

    public static void main(String[] args) {

        MethodFarm farm = new MethodFarm();

        /* <T> 메서드 호출 -> 별도 제약 없이 인자 전달 가능 */
        farm.animalType(new Bunny(), new Snake());
        farm.animalType(new String(), new Object());
        farm.animalType(new JFrame(), new Snake());

        /* T extends Mammal */
        farm.mammalType(new Bunny());

        /* T extends Reptile */
        farm.reptileType(new Snake());

    }
}
