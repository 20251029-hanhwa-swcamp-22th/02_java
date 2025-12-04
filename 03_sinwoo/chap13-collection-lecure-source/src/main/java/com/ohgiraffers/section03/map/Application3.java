package com.ohgiraffers.section03.map;

import java.io.FileInputStream;
import java.util.Properties;

public class Application3 {
    public static void main(String[] args) {

        /* 파일 읽어오기 */
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("driver.dat"));

            System.out.println(prop.getProperty("driver"));

        } catch (Exception e) {

        }

    }
}
