package com.ohgiraffers.level02.normal.book.model.dto;

public class BookDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {
    }

    public BookDTO(String title, String publisher, String author) {
        this.author = author;
        this.publisher = publisher;
        this.title = title;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.author = author;
        this.discountRate = discountRate;
        this.price = price;
        this.publisher = publisher;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate;
    }
}
