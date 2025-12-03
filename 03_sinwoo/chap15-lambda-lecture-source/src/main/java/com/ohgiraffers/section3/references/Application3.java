package com.ohgiraffers.section3.references;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {

        Function<String, Member> function = Member::new;

        Member member1 = function.apply("Lambda A");
        System.out.println(member1);

        Member member2 = function.apply("Lambda B");
        System.out.println(member2);

        /* 스트림 맛보기 + 메서드 참조 */
        List<String> idList = new ArrayList<>();
        idList.add("id1");
        idList.add("id2");
        idList.add("id3");

        List<Member> memberList = idList.stream().map(Member::new).collect(Collectors.toList());

        memberList.stream().forEach(System.out::println);

    }
}
