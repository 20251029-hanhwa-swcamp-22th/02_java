package com.ohgiraffers.section08.objectarray;

public class Car2 {
    private String modelName;
    private int maxSpeed;

    public Car2(String modelName,
                int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "이/가 최고 시속 = " + maxSpeed + "km/h로 달립니다");
    }
}
