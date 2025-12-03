package com.ohgiraffers.section03.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {

        List<List<String>> list =
                Arrays.asList(
                        Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                        Arrays.asList("java", "spring", "springboot")
                );

        System.out.println("list = " + list);

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flatList = " + flatList);
    }
}
