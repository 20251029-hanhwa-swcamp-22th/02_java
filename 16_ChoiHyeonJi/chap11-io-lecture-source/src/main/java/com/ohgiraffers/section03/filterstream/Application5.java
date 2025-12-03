package com.ohgiraffers.section03.filterstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Application5 {
  public static void main(String[] args) {

    /* member.dat 파일 내용을 읽어와 출력 */
    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("memebers.dat"))){
      // 읽어온 Object -> Member[] 다운캐스팅
      // + 직렬화된 데이터를 원래 객체 상태로 바꿈 (역직렬화)
      Member[] inputMembers = (Member[])ois.readObject();
      for(Member member : inputMembers){
        System.out.println(member.toString());
      }
    }catch (IOException e){
      System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
