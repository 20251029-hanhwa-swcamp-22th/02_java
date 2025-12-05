package com.wjdqudwls.section01.list.run;

import java.util.*;

public class Application1 {
  public static void main(String[] args) {

    /* ArrayList
    * - 배열과 유사한 컬렉션 List 클래스
    * - 기존 배열의 단점(크기 변경 불가, 요소 추가/삭제/정렬/검색 복잡)
    *   보완한 List
    * - 검색 속도가 빠름, 대신 추가/삭제가 느림
    * */

    /* 1. 다형성을 활용한 컬렉션 객체 생성
    * - List 인터페이스 하위의 다양한 구현체로 변경이 간으하므로
    *   유연한 코드를 작성할 수 있다.
    * */
    ArrayList alist = new ArrayList(); // 자식타입 = 자식인스턴스
    List list = new ArrayList(); // 부모타입 = 자식인스턴스(업캐스팅)
    Collection clist = new ArrayList(); // 부모타입 = 자식인스턴스(업캐스팅)

    /* 2. 제네릭 사용 유무 확인 */
    // 생성된 요소의 타입을 String으로 제한
    // - 요소 1개를 꺼냈을 때의 타입 == String
    // - 요소 1개를 추가하고 싶을 때 가능한 타입 == String
    List<String> slist = new ArrayList<>();

    slist.add("hello");
    slist.add("world");
//    slist.add(123); // 타입 체크 오류

    for (String str : slist){
      // 무조건 String -> String 전용 메서드 호출 가능
      System.out.println(str.length());
    }

    // 타입 제한 X == 터떤 타입이든 요소로 사용 가능
    List olist = new ArrayList();

    olist.add("hello");
    olist.add("world");
    olist.add(123);

    for (Object obj : olist){
      if (obj instanceof String) {
        System.out.println(((String) obj).length());
      }
      else if (obj instanceof Integer){
        System.out.println(((Integer)obj).intValue());
      }
    }
    /* 3. ArrayList를 이용한 코드 */

    // 1. boolean add(E e) : e를 리스트 마지막 요소로 추가 후 true 반화

    List<String> Fruits = new ArrayList<>();

    Fruits.add("apple");
    Fruits.add("orange");
    Fruits.add("banana");
    Fruits.add("melon");
    Fruits.add("melon");
    Fruits.add("melon");

    System.out.println("Fruits = " + Fruits); // 순서 유지, 중복데이터 저장 확인

    // 2. int size() : List에 저장된 요소의 개수 반한(길이 x)
    System.out.println("Fruits.size() = " + Fruits.size());

    // 3. E get(int index) : index번째 요소를 반환
    // for문 활용
    for (int i = 0; i < Fruits.size(); i++) {
      System.out.println("Fruits.get("+i+") : " + Fruits.get(i));
    }
    // 향상된 for문
    for (String f : Fruits){
      System.out.println(f);
    }
    // 4) void add(int index, E e) : index 번째에 요소(e) 추가
    // - 해당 인덱스를 기준으로 뒤쪽 요소는 1칸씩 밀림
    Fruits.add(1, "mango");
    System.out.println("Fruits = " + Fruits);

    // 5) E set(int Index, E e) : index 번쨰의 요소를 e로 변경
    // - 이 때, 기존 요소가 반환됨
    String before = Fruits.set(2, "grape");
    System.out.println("before = " + before);
    System.out.println("Fruits = " + Fruits);

    // 6) E remove(int index) : Index 번째 요소를 제거
    // - 이 때, 기존 요소가 반환됨
    before = Fruits.remove(0);
    System.out.println("before = " + before);
    System.out.println("Fruits = " + Fruits);

    // 7) Collections.sort(List list) : 오름 차순 정렬
    // - Collections 클래스 : 컬렉션 관련 유용한 기능을 제공하는 클래스
    Collections.sort(Fruits);
//    Collections.reverse(Fruits); // 뒤집기
    System.out.println("Fruits = " + Fruits);
  }
}
