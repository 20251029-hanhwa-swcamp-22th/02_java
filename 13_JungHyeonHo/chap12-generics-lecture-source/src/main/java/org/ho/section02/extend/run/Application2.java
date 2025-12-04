package org.ho.section02.extend.run;

import org.ho.section02.extend.Bunny;
import org.ho.section02.extend.MethodFarm;
import org.ho.section02.extend.Rabbit;
import org.ho.section02.extend.Snake;

public class Application2 {
  public static void main(String[] args) {

    MethodFarm farm = new MethodFarm();

    /* <T> 메서드 호출 -> 별도 제약 없이 인자 전달 가능 */
    farm.animalType(new Bunny(),new Snake()); // 호출 시점에 타입이 결정
    farm.animalType(new String(),new Object());

    /* <T extends Mammal> 확인 */
    //farm.mammalType(new Snake()); // Mammal이거나 자식타입 아님
    farm.mammalType(new Rabbit());

    /* <T extends Reptile> 확인 */
    farm.repTileType(new Snake());
//    farm.repTileType(new Rabbit());
  }
}
