package com.ohgiraffers.section01.object;

import java.util.Objects;

/* 클래스 선언시 extends 키워드가 없다면 컴파일러가 자동으로 Object 상속. */
public class Book {

    /* 책 정보를 관리할 수 있는 Book클래스를 작성 */
    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {
        super(); // -> Object로 이동.
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString: 인스턴스의 정보를 문자열로 반환. -> Overriding 시 인스턴스의 모든 필드 값을 반환하도록 함.
    @Override
    public String toString() {
        return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Book other = (Book) obj;
//        return this.number == other.number && this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
