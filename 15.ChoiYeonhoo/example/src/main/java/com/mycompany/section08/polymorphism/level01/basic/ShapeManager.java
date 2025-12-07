package com.mycompany.section08.polymorphism.level01.basic;

public class ShapeManager {

  private Shape[] shapes = new Shape[10];
  private int index; // 도형 Shape 저장량 : .size와 같음

  public void addShape(Shape shape) {
    /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */

    //1. 배열 크기 확인해서, 꽉 차있으면 이전 배열 사이즈 2배 크기로 새로 생성
    if (index >= shapes.length) {
      Shape[] newshapes = new Shape[shapes.length * 2];

      //2. 기존 내용 복사하기
      for (int i = 0; i < index; i++) {
        newshapes[i] = shapes[i];
      }
      //3. 배열 참조 주소 변경하기
      shapes = newshapes;
    }
    //4. 전달된 Shape 추가하기
    shapes[index++] = shape;

  }

  public void removeShape(Shape shape) {
    /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */

    //1. 배열에서 Shape 찾기
    // 배열에서 저장된 값(index)까지 for문
    for (int i = 0; i < index; i++) {

      if (shapes[i].equals(shape)) {

        // 2. 객체 앞으로 당기기
        // 전달된 모양과 같다면, 그 뒤에 값들을 한칸씩 불어와서 덮어씌움
        // i번째에서 모양이 같으면 i번째부터 index까지? index-1까지? 아 뒤에거 땡겨오니까 마지막에 outOfBound에러 안뜰려면 -1이네
        for (int j = i; j < index - 1; j++) {
          shapes[j] = shapes[j + 1];
        }

        //3. 마지막칸 비우기
        shapes[index - 1] = null;
        index--;

        //4. 당기고 나서, 해당 칸부터 다시 검색
        i--;
      }
    }

  }

  public void printAllShapes() {
    /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
    for (int i = 0; i < index; i++) {
      Shape s = shapes[i];
      System.out.println("이름 : " + s.getClass().getSimpleName());
      System.out.println("넓이 : " + s.calculateArea());
      System.out.println("둘레 : " + s.calculatePerimeter());
    }
  }

  public double getTotalArea() {
    /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
    double totalArea = 0;
    for (int i = 0; i < index; i++) {
      totalArea += shapes[i].calculateArea();

    }
    return totalArea;
  }

  public double getTotalPerimeter() {
    /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
    double totalPerimeter = 0;
    for (int i = 0; i < index; i++) {
      totalPerimeter += shapes[i].calculatePerimeter();

    }
    return totalPerimeter;
  }
}

