package com.ohgiraffers.section01.list.run;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* ArrayList
         * - 배열과 유사한 컬렉센 List 클래스
         * - 기존 배열의 단점(크기 변경 불가, 요소 추가/삭제/정렬/검색 복잡)을 보봔한 LIst
         * - 검색속도가 빠름, 대신 추가/삭제가 느림
         * */

        /* 1. 다형성을 활용한 컬렉션 객체 생성
         * - List 인터페이스 하위의 다양한 구현체로 변경이 가능하므로
         *     유연한 코드르 작성할 수 있다.*/

        ArrayList alist = new ArrayList(); // 자식타입 = 자식 인스턴스
        List list = new ArrayList(); // 부모타입 = 자식 인스턴스 (업캐스팅)
        Collection clist = new ArrayList(); // 부모타입 = 자식 인스턴스 (업캐스팅)

        /* 2. 제네릭 사용 유무 확인 */
        // 생성된 요소의 타입을 String으로 제한
        // - 요소 1개를 꺼냈을 때의 타입 == String
        // - 요소 1개를 추가하고 싶을 때 사용 가능한타입 == String

        List<String> slist = new ArrayList<>();

        slist.add("Hello");
        slist.add("World");
        //  slist.add(123); // 타입 체크 오류

        for (String str : slist) {
            // 무조건 String -> String 전용 메서드 호출 가능
            System.out.println(str.length());
        }

        // 타입제한 X == 어떤타입(Object) 이든 요소로 사용 가능
        List olist = new ArrayList<>();

        olist.add("Hello");
        olist.add("World");
        olist.add(123); // int -> Integer

        for (Object obj : olist) {
            if (obj instanceof String) { // 타입검사
                System.out.println(((String) obj).length()); // 다운 캐스팅
            } else if (obj instanceof Integer) {
                System.out.println(((Integer) obj).intValue()); // 다운 캐스팅
            }

            /* 3. ArratyList를 이용한 코드 */


            // 1) boolean add (E e) : e를 리스트 마지막 요소로 추가 후 true 반환

            List<String> fruits = new ArrayList<>();

            fruits.add("Aaple");
            fruits.add("Orange");
            fruits.add("Kiwi");
            fruits.add("Banana");
            fruits.add("Melon");
            fruits.add("Melon");
            fruits.add("Melon");
            fruits.add("Melon");

            System.out.println("fruits = " + fruits); // 순서유지, 중복 데이터 저장 확인


            /* 2) int size() : List에 저장된 요소의 개수 반환 (길이 X)*/
            System.out.println("fruits.size() = " + fruits.size());


            // 3) E get(int index) : index번째 요소를 반환
            // for문 확인
            for (int i = 0; i < fruits.size(); i++) {
                System.out.println(" fruits.get(" + i + ") : " + fruits.get(i));


                // 향상된 for문
                for (String f : fruits) {
                    System.out.println(f);
                }

                    /* 4) void add (int index, E e) : index 번째에 요소 (e) 추가
                        - 해당 인덱스를 기주능로 뒤쪽 요소는 1칸씩 밀림 */
                fruits.add(1, "mango");
                System.out.println("fruits = " + fruits); // 이거하니 오류남



                /* 5) E set(int index, E e) : index 번째의 요소를  e로 변경
                 * - 이 때, 기존 요소가 반환됨 */
                String before = fruits.set(2, "grape");
                System.out.println("before = " + before);
                System.out.println("fruits = " + fruits);


                /* 6) E remove(int index) : index 번째 요소를 제거
                 * - 이 때, 기존 요소가 반환됨*/
                before = fruits.remove(0);
                System.out.println("before = " + before);
                System.out.println("fruits = " + fruits);


                /* 7) Collections.sort(List list) : 오른 차순 정렬
                 * - Collection 클래스 : 컬렉션 관련 유용한 기능을 제공하는 클래스
                 * */
                Collections.sort(fruits);
                //  Collections.reverse(fruits); // 내림차순 정렬 reverse

                System.out.println("fruits = " + fruits);


                //
                // }

            }

        }


    }
}
