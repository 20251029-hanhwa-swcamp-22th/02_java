package com.ohgiraffers.section07.initblock;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        System.out.println(p1.getInformation());

        Product p2 = new Product(60000);
        System.out.println(p2.getInformation());

        System.out.println();
    }


}
