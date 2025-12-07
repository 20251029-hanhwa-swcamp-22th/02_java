package com.qew032.section02.extend.run;

import com.qew032.section02.extend.Bunny;
import com.qew032.section02.extend.MethodFarm;
import com.qew032.section02.extend.Snake;

public class Application2 {
  public static void main(String[] args) {

    MethodFarm farm = new MethodFarm();

    /* <T> 메서드 호출 - 별도 제약 없이 인자 전달 가능 */
    farm.animalType(new Bunny(), new Snake());
    farm.animalType(new String(), new Object());

    /* <T extends Mammal> 확인 */
    farm.repTileType(new Snake());
    //farm.mammalType(new Rabbit());


  }
}
