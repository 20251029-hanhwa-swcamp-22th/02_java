package com.ohgiraffers.level01.basic;

public class Circle extends Shape implements Resizable{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Shape: Circle"
                + "\nArea: " + calculateArea()
                + "\nPerimeter: " + calculatePerimeter();
    }

}
