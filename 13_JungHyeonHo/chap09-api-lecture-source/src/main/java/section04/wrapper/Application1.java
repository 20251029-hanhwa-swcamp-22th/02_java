package section04.wrapper;

public class Application1 {
  public static void main(String[] args) {

    /* Wrapper Class 사용법 이해하기 */
    int num = 128;

    // 기본 자료형 변수는 객체가 아니다!! (. 연산자로 참조할 것이 없음)
    // System.out.println(num.?);

    /* Boxing : int -> Integer */
//    Integer iNum = new Integer(num); // jdk 1.9 부터 Deprecated(더 이상 사용되지 않음)
    Integer iNum = Integer.valueOf(num);

    System.out.println(iNum.intValue()); // 저장된 값을 Integer에서 int로 반환

    /* Auto Boxing */
    /* 기본 자료형의 형변환 => (int -> double)10 + 1.3 = 11.3
       상속 관계 내 부모/자식 형변환 => Animal a = new Tiger(); ((Tiger)a).bite(); => 다운캐스팅 */
    /* Integer = int => int를 Integer로 Boxing해서 기본자료형을 객체로 변환해줬다. */
    /* iNum2는 원래 객체를 참조해야한다. int값을 대입연산자로 받으면 이걸 재료로 자동으로 값을 받아 객체를 만들어준다. */
    /* Boxing = 자동으로 기본자료형을 통해 객체를 생성한다.*/
    Integer iNum2 = 300; // 300는 int, Integer iNum2 = 300(int 자료형 값)

    System.out.println("iNum2 = " + iNum2);

    /* UnBoxing : Integer -> int*/
    int num3 = iNum2.intValue();

    /* Auto Unboxing */
    int num4 = iNum2;

    // int == Integer -> int == int
    // 주소 비교에서     -> 값 비교로
    // => Auto Unboxing
    System.out.println(num == iNum);


  }
}
