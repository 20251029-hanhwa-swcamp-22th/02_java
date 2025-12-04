package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* IO 패키지는 예외처리를 많이 사용한다 */


        /* try-with-resource 구문
        *   - try에서 사용 후 finally에서 close()하여 자원을 반환해야하는 인스턴스가 있다면
        *     try()안에 작성하여 자동으로 반환하게 함 */
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
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
        }
    }

}
