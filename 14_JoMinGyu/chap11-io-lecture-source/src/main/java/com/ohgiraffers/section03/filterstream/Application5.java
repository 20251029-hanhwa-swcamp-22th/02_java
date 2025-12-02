package com.ohgiraffers.section03.filterstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Application5 {
  public static void main(String[] args) {

    Member[] members = {
        new Member("user01", "pass01", 20, '남'),
        new Member("user02", "pass02", 25, '여'),
        new Member("user03", "pass03", 30, '여')
    };

    try(ObjectInputStream ois
            = new ObjectInputStream(new FileInputStream("members.dat"))) {
      // 읽어온 Object -> Member[] 다운 캐스팅
      // + 직렬화된 데이터를 원래 객체 상태로 바꿈 (역직렬화)
      Member[] inputMembers = (Member[])ois.readObject();

      for(Member mem : members) {
        System.out.println(mem.toString());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
