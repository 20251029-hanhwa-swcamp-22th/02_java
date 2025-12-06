package com.ohgiraffers.section01.thread;

public class Plane implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Plane Flying...");

            try {
                Thread.sleep(1);
                // 현재 쓰래드(Plane)를 1ms간 일시 정지

            } catch (InterruptedException e) {
                // Interrupt = 분탕

                throw new RuntimeException(e);
            }

        }
    }
}

