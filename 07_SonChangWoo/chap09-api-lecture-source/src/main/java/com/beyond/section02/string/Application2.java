package com.beyond.section02.string;

public class Application2 {
  public static void main(String[] args) {

    /* String의 불변성
     * - String은 한 번 값을 저장하면 바꿀 수 없다(final field)
     * - 바꾸고 싶으면 새로운 String 객체를 생성하여
     *   해당 주소를 참조 변수에 대입
     * */

    /* Heap > Constant Pool(상수 풀)
     * - "" 리터럴 표기법을 이용해 생성된 문자열이 저장되는 공간
     * - 동일한 값을 가진 문자열 인스턴스를 단일 인스턴스로 관리한다
     * */

    /* String 객체를 만드는 방법
     * 1) String s1 = "abcd";
     * -> Constant Pool에 생성
     *
     * 2) String s2 = new String("abcd");
     *  -> Heap 메모리 영역에 생성
     * */

    String str1 = "java";
    String str2 = "java";
    String str3 = new String("java");
    String str4 = new String("java");

    System.out.println("str1 == str2 : " + (str1 == str2));
    System.out.println("str2 == str3 : " + (str2 == str3));
    System.out.println("str3 == str4 : " + (str3 == str4));


    /* 하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
     * 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어 있기 때문이다.
     * */
    System.out.println("str1의 hashCode : " + str1.hashCode());
    System.out.println("str2의 hashCode : " + str2.hashCode());
    System.out.println("str3의 hashCode : " + str3.hashCode());
    System.out.println("str4의 hashCode : " + str4.hashCode());
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));

    /* 문자열은 불변이라는 특징을 가진다.
     * 기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아닌 새로운 문자열을 할당하게 된다.
     * */
    str2 += "oracle";

    /* str1과 str2는 동일한 인스턴스였지만 수정 후에는 다른 인스턴스가 된 것을 알 수 있다. */
    System.out.println("str1 == str2 : " + (str1 == str2));

    /* equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
     * 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록 Object의 equals()메소드를
     * 재정의 해 두었다.
     * 따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산 대신
     * equals() 메소드를 사용해야 한다.
     * */
    System.out.println("str1.equals(str3) : " + str1.equals(str3));
    System.out.println("str1.equals(str4) : " + str1.equals(str4));

    /* 참고로 new java.util.Scanner(System.in).nextLine(); 을 이용해 문자열을 입력받는 경우
     * substring으로 잘라내기 해서 새로운 문자열을 생성 후 반환하기 때문에
     * new String()으로 인스턴스를 생성한것과 동일한 것으로 볼 수 있다.
     * 따라서 Scanner로 입력받은 문자열을 비교할 때에는 equals()를 써야 한다.
     * 구분하기 힘들면 그냥 문자열은 다 equals()로 비교하는 것이 가장 좋은 방법이다.
     * */



  }
}