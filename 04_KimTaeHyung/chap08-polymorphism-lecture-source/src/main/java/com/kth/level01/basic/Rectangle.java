package com.kth.level01.basic;

public class Rectangle extends Shape implements Resizable {

  private double width;
  private double height;

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    if(width <= 0){
      throw new IllegalArgumentException("너비는 반드시 양수여야 합니다.");
    }
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if(height <= 0){
      throw new IllegalArgumentException("높이는 반드시 양수여야 합니다.");
    }
    this.height = height;
  }

  @Override
  double calculateArea() {
    return height * width;
  }

  @Override
  double calculatePerimeter() {
    return 2 * (height + width);
  }

  @Override
  public void resize(double factor) {
    this.width *= factor;
    this.height *= factor;
  }

}
