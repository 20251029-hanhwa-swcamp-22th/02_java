package com.mycompany.section01.polymorphism;

public class Application4 {
  public static void main(String[] args) {

    Animal a1 = getAnimal(1);
    Animal a2 = getAnimal(2);
    Animal a3 = getAnimal(3);
    Animal a4 = getAnimal(4);

    a1.sleep();
    a2.sleep();
    a3.sleep();
    a4.sleep();
  }

  public static Animal getAnimal(int num){
    /* 반환형 + 다형성 */
    Animal animal = null;

    switch(num){
      case 1 :
        animal = new Animal();
        break;
      case 2 :
        animal = new Tiger();
        break;
      case 3 :
        animal = new Goat();
        break;
      case 4 :
        animal = new Rabbit();
        break;
      default :
        break;
    }
    return animal;
  }
}
