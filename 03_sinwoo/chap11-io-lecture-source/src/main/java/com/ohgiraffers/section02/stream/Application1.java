package com.ohgiraffers.section02.stream;

import java.io.*;

public class Application1 implements Serializable{
    public static void main(String[] args) {

        /*1. FileInputStream
        *   - File을 읽어오는 바이트 기반 스트림
        *   - 1byte 단위로 읽어옴
        * */

        FileInputStream fis = null;
        try {
            // 지정된 파일의 내용을 바이트 단위로 읽어올 스트림 연결
            fis = new FileInputStream("testInputStream.txt");

            // 1Byte씩 읽어오기
//            int value = 0;
//            while((value = fis.read()) != -1) {
//                System.out.println((char) value);
//            }

            // byte[] 로 읽어오기
            byte[] barr = new byte[100];
            fis.read(barr);
            System.out.println(new String(barr));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
