package com.ohgiraffers.section02.abstractclass;

public class Application
{
    public static void main(String[] args)
    {
        // 추상 클래스인 Product 참조 변수의 묶음(배열) 생성
      Prodeuct[] prodeucts = new Prodeuct[2];

      // 추상 클래스는 참조 변수 타입으로 사용 가능한가? O
      // 추상 클래스를 이용해 인스턴스를 만들 수있는가? X

        Prodeuct p;
        //prodeucts[0] = new Prodeuct();

        // 추상 클래스 참조 변수로 자식 인스턴스를 참조 가능한가? O
        //(업 캐스팅 상태)
        prodeucts[0] = new SmartPhone();
        prodeucts[1] = new SmartWatch();
        for (int i = 0; i < prodeucts.length ; i++)
        {
            /*동적 바인딩을 이용한 메서드 호출
            * -> Produictd의 abstract 메서드가 아닌 오버라이딩이 강제화된 자식 메서드와 연결됨 */
         prodeucts[i].abstMethod();
        }

        //prodeucts[1]
    }
}
