package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        /* java.util.ArrayList
        *   - 기존 list의 단점을 보완
        *   - 검색 속도가 빠른 대신 추가/삭제가 느림 */


        /* 다형성을 활용한 컬렉션 객체 생성
        *   - List 인터페이스 하위의 다양한 구현체로 변경이 가능하므로 유연한 코드를 작성할 수 있다. */
        ArrayList alist = new ArrayList();
        List list = new ArrayList(); // 부모타입 = 식인스턴스 (업캐스팅)
        Collection clist = new ArrayList();

        /* 제네릭 사용 유무 확인
        *  생성된 요소의 타입을 String으로 제한
        *   - 요소 1개를 꺼냈을 때의 타입: String
        *   - 요소 1개를 추가하고 싶을 때 가능한 타입: String */
        List<String> sList = new ArrayList<>();
        sList.add("Hello World");

        for (String s : sList) {
            // 무조건 String -> String전용 메소드 호출 가능.
            System.out.println(s.length());
        }

        // type제한 X : 어떤 타입이든 요소로 사용 가능.
        List oList = new ArrayList();
        oList.add(12312323);
        oList.add("Hello World");
        oList.add(new Object());

        for (Object o : oList) {
            //
            System.out.println(o);
        }

        /* 3. ArrayList활용
        * 1) boolean add(E e) : e를 리스트 마지막 요소로 추가 후 true 반환 */
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("mango");
        System.out.println("fruits = " + fruits);

        /* 2) int size(): List에 저장된 요소의 개수 반환 */
        System.out.println("fruits.size() = " + fruits.size());

        /* 3) E get(int index) : index번째 요소를 반환 */
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits.get(" + i + ") = " + fruits.get(i));
        }

        // 향상된 for문
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /* 4) void add(int index, E e) : index번째에 요소(e) 추가
        *   - 해당 인덱스를 기준으로 뒤쪽 요소는 index + 1 */
        fruits.add(2, "lemonHAHAHUSHDUWHAUHDWA");
        System.out.println("fruits = " + fruits);

        /* 5) E set(int index, E e) : index번째의 요소를 (e)로 변경
        *   - 기존 요소가 반환됨 */
        String before = fruits.set(2,"KIKIKIKIKDWQIDWQDKIW");
        System.out.println("before = " + before);
        System.out.println("fruits = " + fruits);

        /* 6) E remove(int index) : index번째 요소를 제거
        *   - 기존 요소 반환됨 */
        before = fruits.remove(2);
        System.out.println("before = " + before);
        System.out.println("fruits = " + fruits);
        
        /* 7) Collections.sort(List list) 
        *   - Collections 클래스 : 컬렉션 관련 유용한 기능을 제공하는 클래스 */
        Collections.sort(fruits);
        System.out.println("fruits = " + fruits);
//        Collections.reverse(fruits); -> 뒤집기
//        System.out.println("fruits = " + fruits);

    }
}
