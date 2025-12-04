package com.my.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application3 {
  public static void main(String[] args) {

    /* 람다식 */
    Function<String, Member> function1 = id -> new Member(id);
    Member member1 = function1.apply("user01");
    System.out.println("member1 = " + member1);

    /* 생성자 메서드 참조
    * 메서드명이 아닌 new를 :: 뒤에 붙임
    * new -> 생성된 인스턴스의 주소 반환
    * */
    Function<String, Member> function2 = Member::new;
    Member member2 = function2.apply("user02");
    System.out.println("member2 = " + member2);


    /* 스트림 맛보기 + 메서드 참조 */
    List<String> idList = new ArrayList<>();
    idList.add("id1");
    idList.add("id2");
    idList.add("id3");

    //Stream 하나씩 꺼내오는 상태
    //String, String, String.map(Member::new)
    //map(member객체1, member객체2, member객체3)
    List<Member> memberList = idList.stream().map(Member::new).collect(Collectors.toList());
    //memberList.forEach(mem -> System.out.println(mem));
    memberList.stream().forEach(System.out::println);
  }
}
