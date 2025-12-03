package com.kang.section01.object;


/* 클래스 선언 시 extends 구문이 미작성되면
 * 컴파일러가 extends Object를 자동 추가
 */

import java.util.Objects;

public class Book {

  /* 책 정보를 관리할 수 있는 Book클래스를 작성 */
  private int number;
  private String title;
  private String author;
  private int price;

  public Book() {
    super();

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

  /* toString() 메서드의 목적 : 인스턴스의 정보를 문자열로 반환 */
  /* -> 오버라이딩 시 인스턴스의 모든 필드 값을 반환하도록 재정의 */
  /* 상속 받을때 결국 최하단 클래스가 있을텐데, 거기서 Object를 상속받아서 맨 위로 올라감*/
  @Override
  public String toString() {
    return "Book {" +
        "number: " + number
        + ",title: " + title
        + ",author: " + author
        + ",price: " + price
        + "}";
  }

  /* equals() 오버라이딩 */
//  @Override
//  public boolean equals(Object obj) {
//    if(obj==null || getClass()!=obj.getClass()) return false;
//
//    /* 다운 캐스팅 진행 */
//    Book other = (Book) obj;
//    return this.number == other.number &&
//        this.title.equals(other.title) &&
//        this.author.equals(other.author) &&
//        this.price == other.price;
//  }

  //alt+insert 후에 equals and hashcode 생성
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
  }

  /* hashCode란 DB에서의 PK값을 만드는 것이라고 생각하면 된다. */
  /* Object의 hashCode는 객체의 메모리 주소값을 이용해서 해시코드를 만든다 */
  /* => 필드값이 다를 때 동등한 hashCode를 갖지 못한다. */
  /* 객체의 메모리 주소값 => 필드값을 이용해 해시코드를 만들어야 한다. */
  /* => 동등한 데이터 = 동등한 hashCode */

  /* hashCode() 오버라이딩
   *  - 동등한 객체는 동등한 hashCode() 가져야 한다
   * */
  @Override
  public int hashCode() {
    return Objects.hash(number, title, author, price);
  }
}