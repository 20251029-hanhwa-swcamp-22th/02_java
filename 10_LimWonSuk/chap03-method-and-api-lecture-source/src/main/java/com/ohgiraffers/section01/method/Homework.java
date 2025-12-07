package com.ohgiraffers.section01.method;

public class Homework
{ public void Method(){
    System.out.println("메서드 확인");
}
public int sum10(){
    int sum = 0;
    for (int i = 0; i < 10; i++) {
        sum = i;
    }
    return sum;
}
public int PlusMethod(int a, int b){
    return a + b;
}
public int MinusMethod(int a, int b){
    return a - b;
}
}

