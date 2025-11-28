package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* IO 패키지는 예외처리를 많이 사용한다 */
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("test.txt");
            br = new BufferedReader(fr);

            String s = null;
            while(true) {
                s = br.readLine();
                if(s == null) break;
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close(); // stream 해제 (메모리 반환)
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
