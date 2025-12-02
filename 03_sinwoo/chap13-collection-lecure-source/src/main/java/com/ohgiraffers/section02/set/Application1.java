package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {
        /* Set: 순서 유지 X, 중복 데이터 X (중복 제거)
        *
        * HashSet: hash코드를 이용해서 검색 속도를 증가 시킨 set
        *   - 사용 조건: Set에 저장되는 인스턴스는 equals(), hashCode() 오버라이딩이 필수이다.
        * */

        Set<String> set = new HashSet<>();

        // 1) boolean add(E e): 요소 추가
        set.add("Java");
        set.add("Spring");
        set.add("Hibernate");
        set.add("mariadb");
        set.add("Oracle");
        set.add("Oracle"); // 중복 제거
        set.add(new String("Oracle")); // 중복 제거

        // 중복 제거 + 순서 유지 X
        System.out.println(set);

        // set에 저장된 요소의 개수
        System.out.println("set.size() = " + set.size());

        // 3) boolean contains(E e): 전달된 요소가 set에 있으면 true
        System.out.println("set.contains(\"dawdawd\") = " + set.contains("Java"));

        // 4) boolean remove(E e): 같은 요소를 찾아서 삭제 성공하면 true
        System.out.println("set.remove(\"d\") = " + set.remove("Java"));
        System.out.println("set.remove(\"d\") = " + set.remove("dada"));
        System.out.println(set);

        System.out.println("--------------------------------------------------------------");
        
        /* Set에 저장된 데이터 얻어오기 
        *   - Set은 기본적으로 특정 요소 1개 얻어오기가 불가능하다
        *   -> Set 데이터 순회 방법을 이용(순차 접근)
        * */
        
        /* 1. Set -> 배열로 변경 */
        Object[] array = set.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
        /* 2. Iterable의 iterator() 메서드 */
        Iterator<String> it = set.iterator(); // set에 저장된 요소를 반복하면서 순회하는 인스턴스를 생성 후 반환
        while (it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }

        /* 3. 향상된 for문 사용 */
        for (String s : set) {
            System.out.println("s = " + s);
        }


    }

}
