package com.ohgiraffers.section01.object;

public class Book extends Object{
  private int number;
  private String title;
  private String author;
  private int price;

  public Book() {
    super();
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

  @Override
  public String toString() {
    return "Book{ "
        +"number: " + number
        +", title: " + title
        +", author: " + author
        +", price: " + price
        +"}";
  }
}
