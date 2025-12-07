package com.mycompany.section08.polymorphism.level01.basic;

public class Rectangle extends Shape implements Resizable {

  private double width;
  private double height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public void resize(double factor) {
    this.height = factor * height;
    this.width = factor * width;
  }

  @Override
  double calculateArea() {
    return width * height;
  }

  @Override
  double calculatePerimeter() {
    return 2 * (width + height);
  }
}
