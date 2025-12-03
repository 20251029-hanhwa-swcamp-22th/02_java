package com.mycompany.section01.list.run;

import java.util.*;

public class Application1 {
  public static void main(String[] args) {

    /* java.util.ArrayList
    * - 배열과 유사한 컬렉션 List 클래스
    * - 기존 배열의 단점(크기 변경 불가, 요소 추가/삭제/정렬/검색 복잡)을
    *   보완한 List
    * - 검색 속도가 빠름, 대신 추가/삭제가 느림
    * */

    /* 1. 다형성을 활용한 컬렉션 객체 생성
    * - List Interface 하위의 다양한 구현체로 변경이 가능하므로,
    *   유연한 코드를 작성할 수 있다.
    * */

    ArrayList aList = new ArrayList();// 자식 타입 = 자식 인스턴스
    List list = new ArrayList(); // 부모 타입 = 자식 인스턴스 (업캐스팅)
    Collection cList = new ArrayList(); // 부모 타입 = 자식 인스턴스 (업캐스팅)

    /* 2. 제네릭 사용 유무 확인 */
    // 생성된 요소의 타입을 String으로 제한
    // - 요소 1개를 꺼냈을 때의 타입 == String
    // - 요소 1개를 추가 하고 싶을 때 가능한 타입 == String
    List<String> sList = new ArrayList<>();

    sList.add("hello");
    sList.add("world");
//    sList.add(123); // 타입 체크 오류

    for (String s : sList) {
      // 무조건 String -> String 전용 메서드 호출 가능
      System.out.println(s.length());
    }

    // 타입 제한 X == 어떤 타입(Object)이든 요소로 사용 가능
    List oList = new ArrayList();
    oList.add("hello");
    oList.add("world");
    oList.add(123);

    for (Object obj : oList) {
      // 무조건 String -> String 전용 메서드 호출 가능
      if (obj instanceof String) {
        System.out.println(((String)obj).length()); // 다운 캐스팅
      }
      else if(obj instanceof Integer){
        System.out.println(((Integer) obj).intValue()); // 다운 캐스팅
      }
    }


    /* 3. ArrayList를 이용한 코드 */
    // 1) boolean add(E e) : e를 리스트 마지막 요소로 추가 후, true를 반환

    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("melon");
    fruits.add("melon");
    fruits.add("melon");

    System.out.println("fruits = " + fruits.toString()); // 순서 유지, 중복 데이터 저장 확인

    // 2) int size() : List에 저장된 요소의 개수 반환(길이x)
    System.out.println("fruits.size() = " + fruits.size());
    
    // 3) E get(int index) : index번째 요소를 반환
    // for문 활용
    for (int i = 0; i < fruits.size(); i++) {
      System.out.println("fruits.get("+i+") : " + fruits.get(i));
    }

    // 향샹된 for문
    for (String fruit : fruits) {
      System.out.println("fruit : " + fruit);
    }

    // 4) void add(int index, E e) : index번째에 요소(e) 추가
    // - 해당 인덱스를 기준으로 뒤쪽 요소는 한칸씩 밀림

    fruits.add(1, "mango");

    System.out.println("fruits = " + fruits);

    // 5. E set(int index, E e) : index번째의 요소를 e로 변경
    // - 이 때, 기존 요소가 반환 됨.
    String before = fruits.set(2,"grape");
    System.out.println("before = " + before);
    System.out.println("fruits = " + fruits);

    // 6. E remove(int index) : index번째 요소를 제거
    // - 이 때, 기존 요소가 반환됨

    String remove = fruits.remove(0);
    System.out.println("before = " + before);
    System.out.println("fruits = " + fruits);

    // 7. Collections.sort(List list) : 오름 차순 정렬
    // - Collections 클래스 : 컬렉션 관련 유용한 기능을 제공하는 클래스.

    Collections.sort(fruits);
    Collections.reverse(fruits); // 뒤집기
    System.out.println("fruits = " + fruits);

  }
}
