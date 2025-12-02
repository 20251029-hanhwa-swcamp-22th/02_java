package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application4 {
  public static void main(String[] args) {
    /* ObjectInputStream/OutputStream
    * - 객체 단위 입출력 보조 스트림
    * */

    Member[] members = {
      new Member("user01", "pass01", 20, '남'),
      new Member("user02", "pass02", 25, '여'),
      new Member("user03", "pass03", 30, '여')
    };

    try(ObjectOutputStream oos
            = new ObjectOutputStream(new FileOutputStream("members.dat"))) {
      oos.writeObject(members);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
