package com.mycompany.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application1 {
  public static void main(String[] args) {

    /* Map : K, V 쌍으로 데이터를 저장하는 컬렉션
    *  - Key는 중복 X, 순서 유지 X
    *  - Value는 중복 O (같은 데이터도 Key로 구분 가능)
    *
    * HashMap
    * - 검색이 빠른 Map
    * - Key 인스턴스에 equals(), hashCode() 오버라이딩 필수
    * */

    Map<String, String> map = new HashMap<>();

    // 1) V put(K k, V v) : Map에 K,V 쌍 추가
    // - 기존에 같은 Key 가 존재 했다면 
    //   덮어 쓰고 이전 Value를 반환
    // - 기존에 같은 Key가 없다면 null 반환

    map.put("one","SW공학");
    map.put("two","git");
    map.put("three","DB");
    map.put("four","Linux");
    map.put("five","Java");
    map.put("five","Java Programing"); // 같은 key -> value 덮어 쓰기
    map.put("seven","Java Programing"); // 같은 key -> value 덮어 쓰기

    System.out.println(map.put("six", "자료구조"));
    System.out.println(map.put("six", "자료구조&알고리즘"));
    System.out.println(map);

    // 2) V remove(K k) : Key가 일치하는 요소를 제거

    System.out.println(map.remove("one"));
    System.out.println(map);

    //3) V get(K k) : Key가 일리차는 요소를 얻어와 Value 반환
    System.out.println(map.get("two"));
    System.out.println(map.get("three"));

    System.out.println("----------------------------------------------------------------");

    /* Map 순회 방법 */

    /* 1. keySet() : Key만 묶어서 Set으로 반환 */
    Set<String> keys = map.keySet();

    for (String key : keys){
      System.out.println(key + " / " + map.get(key));
    }

    /* 2. values() : Value만 묶어서 반환 - value 중복되도 된다. */
    Collection<String> values = map.values();

    for (String value : values){
      System.out.println(value);
    }

    /* 3. entrySet() : K, V 쌍을 묶어서 Set 형태로 반환 */
    Set<Map.Entry<String,String>> entries = map.entrySet();

    for (Map.Entry<String,String> entry :entries){
      System.out.println("key : " + entry.getKey());
      System.out.println("value : " + entry.getValue());
    }
  }
}
