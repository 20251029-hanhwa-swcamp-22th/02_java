package org.ho.section02.encapsulation.problem2;

public class Application {
  public static void main(String[] args) {
    Monster monster1 = new Monster();
//    monster1.name = "드라큘라"; // 직접
    monster1.setInfo("드라큘라"); // 간접
    monster1.hp = 200;
    System.out.println("monster1 name : " + monster1.getInfo());
    System.out.println("monster1 hp : " + monster1.hp);


    Monster monster2 = new Monster();
//    monster2.name = "프랑켄슈타인";
    monster2.setInfo("프랑켄슈타인");
    monster2.setHp(300);
    System.out.println("monster2 name : " + monster2.getInfo());
    System.out.println("monster2 hp : " + monster2.hp);

    Monster monster3 = new Monster();
//    monster3.name = "미이라";
    monster3.setInfo("미이라");
//    monster3.hp = -400;
    /* hp는 음수 값일 수 없다!*/
    monster3.setHp(-400);
    System.out.println("monster3 name : " + monster3.getInfo());
    System.out.println("monster3 hp : " + monster3.hp);
  }
}
