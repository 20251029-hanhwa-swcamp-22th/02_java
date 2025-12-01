package com.ohgiraffers.section02.extend;

// Rabbit instance 생성시 Rabbit 또는 Rabbit을 상속받은 서브 타입으로만 생성 가능.
public class RabbitFarm <T extends Rabbit>{

    private T rabbit;

    public RabbitFarm() {}

    public RabbitFarm(T rabbit) {
        this.rabbit = rabbit;
    }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }

}
