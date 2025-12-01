package com.ohgiraffers.section02.extend;


// RabbitFArm 인스턴스 생성 시
// Rabbit 또는 Rabbit 을 상속받은 ㅂ=자식 탕립으로만 생성 가능
public class RabbitFarm<T extends Rabbit> {
    private T rabbit;

    public RabbitFarm() {


    }

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
