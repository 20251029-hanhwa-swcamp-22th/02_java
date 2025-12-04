package com.my.section04.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {
  public static void main(String[] args) {
    List<Member> memberList = Arrays.asList(
        new Member("test01", "testName01"),
        new Member("test02", "testName022"),
        new Member("test03", "testName0333")
    );
    /* toList(): 스트림을 이용해서 새로운 @@불변@@ List 생성 */
    List<String> nameList = memberList
        .stream()
        //.map(member -> member.getMemberName())
        .map(Member::getMemberName)
        .toList();  // 불변

    System.out.println(nameList);

    //nameList.add("testName04");
    //System.out.println(nameList);
    // -> java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142) Immutable: 불변의

    /* collect(Collectors.toList())
     * : 스트림을 이용해서 새로운 가변 List 생성 */
    List<String> nameList1 = memberList
        .stream()
        //.map(member -> member.getMemberName())
        .map(Member::getMemberName)
        .collect(Collectors.toList()); // 가변

    System.out.println(nameList1);
    nameList1.add("testName04");
    System.out.println(nameList1);

    /* joining() */
    String str = memberList.stream()
        .map(Member::getMemberName)
        .collect(Collectors.joining(" || ", "**", "**"));
    // delimiter 구분자
    // prefix 접두사
    // suffix 접미사

    System.out.println("str = " + str);

    /* Map k V
    * {이름길이(k) = 이름길이가같은수(V)}
    * */
    Map<Integer, Long> countByNameLength =
        memberList.stream()
            .collect(
                Collectors.groupingBy(
                    m -> m.getMemberName().length(),
                    Collectors.counting()
                )
            );
    System.out.println("countByNameLength" + countByNameLength);

  }
}
