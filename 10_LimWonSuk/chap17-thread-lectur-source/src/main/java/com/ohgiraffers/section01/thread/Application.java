package com.ohgiraffers.section01.thread;

public class Application {
    /*java 프로그램 실행 시
     * main thread가 main() 메서드를 호출함
     * */
    public static void main(String[] args) {
        Thread th1 = new Car();
        Thread th2 = new Tank();
       // Thread th3 = new Plane(); // 형제(남)관계 라 쓰레드 생성자를 만들어 지정해야함
        Thread th3 = new Thread(new Plane()); // Runnable 상속 스레드 생성 방법


        /* 스레드 우선 순위 확인 == 5 */
        System.out.println("th1.getPriority()t = " + th1.getPriority());
        System.out.println("th2.getPriority()t = " + th2.getPriority());
        System.out.println("th3.getPriority()t = " + th3.getPriority());


        /* 우선 순위 변경 */
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(Thread.NORM_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("th1.getPriority()t = " + th1.getPriority());
        System.out.println("th2.getPriority()t = " + th2.getPriority());
        System.out.println("th3.getPriority()t = " + th3.getPriority());


        /* run() 메서드 호출 == main 스레드에 run() 메서드를 호출 하여 실행
         * -> 순서대로 실행됨
         * */

        /*th1.run();
        th2.run();*/


        /*start() 메서드 호출 == 별도 스레드를 생성해서 각각 run() 메서드를 호출
         * -> 동시에 실행됨
         * */

        th1.start();
        th2.start();
        th3.start();

        /* join()
        * - 지정된 스레드(th1,th2,th3)가 동작을 마무리 할 때 까지
        * 현재 스레드를 종료 시키지 않고 대기 (일시 정지) */
        try{
            th1.join(); // join 안에있는 코드가 끝나야 맨밑으로 진행
            th1.join();
            th1.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(" main thread end ...");
    }
}
