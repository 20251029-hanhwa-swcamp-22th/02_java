package com.ohgiraffers.section03.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            // properties를 이용하여 파일 저장하기.
            prop.store(new FileOutputStream("driver.dat"), "JDBC Driver Properties");
            prop.store(new FileWriter("driver.txt"), "JDBC Driver Properties");
            prop.storeToXML(new FileOutputStream("driver.xml"), "JDBC Driver Properties");
        } catch (Exception e) {

        }
    }

}
