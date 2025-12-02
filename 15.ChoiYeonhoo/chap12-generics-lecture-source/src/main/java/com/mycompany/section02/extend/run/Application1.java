package com.mycompany.section02.extend.run;

import com.mycompany.section02.extend.*;

public class Application1 {
  public static void main(String[] args) {

    /* extend 키워드를 이용한 제네릭 타입 범위 제한 */

    /* super 타입 또는 관련 없는 타입으로 인스턴스 생성 불가능 */
//    RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>(); // 에러 발생 //Animal은 Rabbit을 상속 받지 않음
//    RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>(); // 에러 발생 Mammal은 Rabbit을 상속 받지 않음
//    RabbitFarm<Reptile> farm3 = new RabbitFarm<Reptile>(); // 에러 발생 Reptile Rabbit을 상속 받지 않음

    /* Rabbit 또는 자식 타입으로 인스턴스 생성 */
    RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();  // <> == 타입 추론 // 앞의 타입을 보고 생략 가능
    RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
    RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

    farm1.setRabbit(new Rabbit());
    farm2.setRabbit(new Bunny());
    farm3.setRabbit(new DrunkenBunny());

    farm1.getRabbit().cry();
    farm2.getRabbit().cry();
    farm3.getRabbit().cry();


  }

}
