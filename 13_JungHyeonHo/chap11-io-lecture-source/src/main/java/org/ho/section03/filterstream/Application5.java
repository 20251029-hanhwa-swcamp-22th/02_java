package org.ho.section03.filterstream;

import java.io.*;

public class Application5 {
  public static void main(String[] args) {
    /* Members.dat만 가져와서 읽어올 때 */
    try (ObjectInputStream ois =
        new ObjectInputStream(new FileInputStream("members.dat"))) {

      // 읽어온 Object -> Member[] 다운캐스팅
      // + 직렬화된 데이터를 원래 객체 상태로 바꿈 (역직렬화)
      Member[] inputMembers = (Member[])ois.readObject();

      // Member에 implements serializable을 안했을 때 오류 발생
      // writing aborted; java.io.NotSerializableException: org.ho.section03.filterstream.Member
      for (Member mem : inputMembers) {
        System.out.println(mem.toString());
      }
    }
    catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}
