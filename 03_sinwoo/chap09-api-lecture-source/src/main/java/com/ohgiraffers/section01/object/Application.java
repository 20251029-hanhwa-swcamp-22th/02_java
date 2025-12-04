package com.ohgiraffers.section01.object;

public class Application {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Java in a Nutshell", "", 3990);
        Book book2 = new Book(2, "Java in a Nutshell", "", 3990);
        Book book3 = new Book(3, "Head First Java", "", 5990);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        /* equlas Overriding 확인 */
        Book book4 = new Book(4,"yyyyyayyayayayayaya", "dadad2123123", 5990);
        Book book5 = new Book(4,"yyyyyayyayayayayaya", "dadad2123123", 5990);

        // 동일비교 -> 주소 비교
        System.out.println(book4 == book5); // false

        // 동등비교 -> 객체의 필드값 비교
        System.out.println(book4.equals(book5)); // true

        System.out.println("book4.hashCode() = " + book4.hashCode());
        System.out.println("book5.hashCode() = " + book5.hashCode());

    }
}