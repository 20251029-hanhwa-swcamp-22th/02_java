package com.ohgiraffers.level01.basic;

public class ShapeManager {

    private Shape[] shapes = new Shape[10];

    private int index = 0;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if (index <= this.shapes.length - 1) {
            this.shapes[index] = shape;
            index++;
        }else {
            Shape[] newShapes = new Shape[shapes.length * 2];
            for (int i = 0; i < this.shapes.length; i++) {
                newShapes[i] = this.shapes[i];
            }
            newShapes[index] = shape;
            this.shapes = newShapes;
        }
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == shape) {
                for (int j = i; j < shapes.length-1; j++) {
                    shapes[j] = shapes[j+1];
                }
                index--;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (int i = 0; i < index; i++) {
            System.out.println(shapes[i]);
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double result = 0;
        for (int i = 0; i < index; i++) {
            result += this.shapes[i].calculateArea();
        }
        return result;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double result = 0;
        for (int i = 0; i < index; i++) {
            result += this.shapes[i].calculatePerimeter();
        }
        return result;
    }
}
