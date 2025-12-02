package org.ho.section02.extend.run;

import org.ho.section02.extend.*;

public class Application1{
  public static void main(String[] args) {
    /* extend 키워드를 이용한 제네릭 타입 범위 제한 */
    /* super 타입 또는 관련 없는 타입으로 인스턴스 생성 불가능 */
    // 오류 발생 : Type parameter 'org.ho.section02.extend.Animal' is not within its bound;
    //            should implement 'org.ho.section02.extend.Rabbit'
//    RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//    RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();
//    RabbitFarm<Reptile> farm1 = new RabbitFarm<Reptile>();

    /* Rabbit 또는 후손 타입으로 인스턴스 생성 가능 */
    RabbitFarm<Rabbit> farm1 = new RabbitFarm<>(); // <> == 타입 추론
    RabbitFarm<Bunny> farm2 = new RabbitFarm<>(); // 무조건 앞뒤 <>에는 똑같은 타입
    RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

    farm1.setRabbit(new Rabbit());
    farm2.setRabbit(new Bunny());
    farm3.setRabbit(new DrunkenBunny());

    farm1.getRabbit().cry();
    farm2.getRabbit().cry();
    farm3.getRabbit().cry();
  }
}
