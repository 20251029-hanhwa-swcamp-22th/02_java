package com.kth.level01.basic;

public class Triangle extends Shape implements Resizable {

  private double base;
  private double height;
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double base, double height, double side1, double side2, double side3) {

    if(side1 <= 0 || side2 <= 0 || side3 <= 0){
      throw new IllegalArgumentException("모든 변의 길이는 0보다 커야 합니다.");
    }

    if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
      throw new IllegalArgumentException("삼각형의 두 변의 길이의 합은 나머지 변의 길이보다 커야 합니다.");
    }

    setBase(base);
    setHeight(height);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    if(base <= 0){
      throw new IllegalArgumentException("밑변은 양수여야 합니다.");
    }
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if(height <= 0){
      throw new IllegalArgumentException("높이는 양수여야 합니다.");
    }
    this.height = height;
  }

  public double getSide1(){
    return side1;
  }

  public void setSide1(double side1){
    this.side1 = side1;
  }

  public double getSide2(){
    return side2;
  }

  public void setSide2(double side2){
    this.side2 = side2;
  }

  public double getSide3(){
    return side3;
  }

  public void setSide3(double side3){
    this.side3 = side3;
  }

  @Override
  public double calculateArea() {
    return (base * height) / 2;
  }

  @Override
  public double calculatePerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public void resize(double factor){
    this.base *= factor;
    this.height *= factor;
    this.side1 *= factor;
    this.side2 *= factor;
    this.side3 *= factor;
  }
}
