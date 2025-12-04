package com.ohgiraffers.level01.basic;

public class Rectangle extends Shape implements Resizable {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {
        return (this.width * 2) + (this.height * 2);
    }

    public String toString() {
        return "Shape: Rectangle"
                + "\nArea: " + calculateArea()
                + "\nPerimeter: " + calculatePerimeter();
    }
}
