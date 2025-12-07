package com.mycompany.section08.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable {

  private double radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public void resize(double factor) {
    this.radius = radius * factor;
  }
}
