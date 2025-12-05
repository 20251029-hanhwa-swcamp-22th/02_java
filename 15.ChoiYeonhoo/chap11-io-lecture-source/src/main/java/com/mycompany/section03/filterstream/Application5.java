package com.mycompany.section03.filterstream;

import java.io.*;

public class Application5 {
  public static void main(String[] args) {

    /* members.dat 파일 내용을 읽어와 출력 */
    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("members.dat"))){

      Member[] inputMembers = (Member[]) ois.readObject();

      for (Member mem : inputMembers) {
        System.out.println(mem.toString());
      }
    }

    catch (IOException e){
      System.out.println(e.getMessage());
    }
    catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
