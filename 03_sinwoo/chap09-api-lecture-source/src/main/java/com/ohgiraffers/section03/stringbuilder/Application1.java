package com.ohgiraffers.section03.stringbuilder;

public class Application1 {

    public static void main(String[] args) {

        // String 불변성 확인
        String str1 = "java";
        System.out.println(System.identityHashCode(str1));

        str1 = str1 + "mariadb";
        System.out.println(System.identityHashCode(str1));
        /* str1 주소가 바뀜. 서로 다른 곳을 참조. */

        /* String의 불변성 문제를 해결하기 위해 빌더 사용. */
        System.out.println("======== String Builder ========");
        StringBuilder sb = new StringBuilder();
        System.out.println("System.identityHashCode(sb) = " + System.identityHashCode(sb));
        // .append() : 값을 제일 뒤에 추가(덧붙이기)
        sb.append("java");
        System.out.println("sb = " + sb.toString());
        System.out.println("System.identityHashCode(sb) = " + System.identityHashCode(sb));

        sb.append("JAVA");
        System.out.println("sb = " + sb.toString());
        System.out.println("System.identityHashCode(sb) = " + System.identityHashCode(sb));


    }
}
