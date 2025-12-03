package com.ohgiraffers.section04.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName1"),
                new Member("test02", "testName22"),
                new Member("test03", "testName333")
        );

        /* toList() : 스트림을 이용해서 새로운 불변List 생성 */
        List<String> nameList1 = memberList.stream().map(Member::getMemberName).toList();
        System.out.println("nameList1 = " + nameList1);

        /* collect(Collectors.toList()) : 스트림을 이용해서 새로운 가변List 생성*/
        List<String> nameList2 = memberList.stream().map(Member::getMemberName).collect(Collectors.toList());
        nameList2.add("testName04");
        System.out.println("nameList2 = " + nameList2);

        Map<Integer, Long> countByNameLength =
                memberList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        m -> m.getMemberName().length(),
                                        Collectors.counting()
                                )
                        );
        System.out.println("countByNameLength = " + countByNameLength);
    }

}