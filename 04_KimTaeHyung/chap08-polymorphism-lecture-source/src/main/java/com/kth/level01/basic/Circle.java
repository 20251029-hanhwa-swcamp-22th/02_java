package com.kth.level01.basic;

public class Circle extends Shape implements Resizable {

  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if(radius <= 0){
      throw new IllegalArgumentException("반지름은 반드시 양수여야 합니다.");
    }
    this.radius = radius;
  }

  @Override
  double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public void resize(double factor) {
    this.radius *= factor;
  }

}
