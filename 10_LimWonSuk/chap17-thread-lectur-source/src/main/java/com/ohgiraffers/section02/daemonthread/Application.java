package com.ohgiraffers.section02.daemonthread;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 데몬스레드
        * - 백그라운드 에서 보조 역할을 수행하는 스레드
        * - 다른 일반 스레드들이 모두 종료되면 같이 종료된다*/
/*        Thread thread = new Thread(()->{
            try {
                Thread.sleep(100);// 0.1초 일시정지
            }catch (InterruptedException e){
                //    throw new RuntimeException(e); // 에러메세지
            }

            for (int i = 10; i > 0; i--) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);// 1초 일시정지
                }catch (InterruptedException e){
                //    throw new RuntimeException(e); // 에러메세지
                }*/

        Thread thread = new Thread(()->{
            try {
                Thread.sleep(100);// 0.1초 일시정지
            }catch (InterruptedException e){
                //    throw new RuntimeException(e); // 에러메세지
            }

            for (int i = 1; i > 0; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(100);// 1초 일시정지
                }catch (InterruptedException e){
                    //    throw new RuntimeException(e); // 에러메세지
                }

            }
        });

        /* setDaemon(true) : 지정된 스레드를 데몬 스레드로 설정
        * 반드시 start() 전에 설정해야 한다
        * */
        thread.setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        thread.setDaemon(true);
        thread.start();

      /*  thread.start(); */

        /* main 스레드의 동작*/
        Scanner sc = new Scanner(System.in);
        System.out.println("카운트를 멈추려면 아무 키나 입력하시오");
        String input = sc.nextLine();
        System.out.println("input = " + input);
        System.out.println("==========카운트 종료=====");



    }

}
