package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application4 {
  public static void main(String[] args) {
    /* ObjectInputStream/OutputStream
    * - 객체 단위 입출력 보조 스트림
    * */

    // 멤버 참조변수
    Member[] members = {
        new Member("user01", "pass01", 20,'남'),
        new Member("user02", "pass02", 25,'여'),
        new Member("user03", "pass03", 30,'여'),
        new Member("user04", "pass04", 40,'남'),
        new Member("user05", "pass05", 45,'여'),
    };

    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("memebers.dat"))){
      oos.writeObject(members); //멤버 배열인데 되는 이유?  Object obj = members; 모든 객체 클래스는 오브젝트의 자손들 참조는 오브젝트 타입만 업캐스팅 매개변수 적용
      // 매개변수에 업캐스팅 적용
    }catch (IOException e){
      System.out.println(e.getMessage());
    }

    //읽어오기
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
  // 직렬화 되어있어서 한줄로 나옴 직렬화 안하면 여러줄로 나옴
}
