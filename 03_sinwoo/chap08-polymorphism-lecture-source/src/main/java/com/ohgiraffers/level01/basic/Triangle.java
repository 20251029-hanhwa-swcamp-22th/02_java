package com.ohgiraffers.level01.basic;

public class Triangle extends Shape implements Resizable {

    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        this.base *= factor;
        this.height *= factor;
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }

    @Override
    double calculateArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString() {
        return "Shape: Triangle"
                + "\nArea: " + calculateArea()
                + "\nPerimeter: " + calculatePerimeter();
    }
}
