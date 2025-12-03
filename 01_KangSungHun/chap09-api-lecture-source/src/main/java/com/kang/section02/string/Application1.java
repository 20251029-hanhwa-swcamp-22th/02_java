package com.kang.section02.string;

public class Application1 {
  public static void main(String[] args) {

    /* charAt() */
    String str1 = "apple";

    for (int i = 0; i < str1.length(); i++) {
      System.out.println("charAt(" + i + ") : " + str1.charAt(i));



      /* compareTo() */
      String str2 = "java";
      String str3 = "java";
      String str4 = "JAVA";
      String str5 = "oracle";

      /* 같으면 0을 반환한다 */
      System.out.println("compareTo() : " + (str2.compareTo(str3)));		//0

      /*대문자와 소문자는 32만큼 차이가 난다.*/
      System.out.println("compareTo() : " + (str2.compareTo(str4)));		//32
      System.out.println("compareTo() : " + (str4.compareTo(str2)));		//-32

      /* jklmno j부터 o까지 5만큼 차이가 난다. */
      System.out.println("compareTo() : " + (str2.compareTo(str5)));		//-5
      System.out.println("compareTo() : " + (str5.compareTo(str2)));		//5

      /* 구체적으로 어떤 값이 나오는지보다 양수인지 음수인지를 판단할 목적으로 주로 사용된다. */

      /* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다. */
      System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));	//0


      /* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
       * 원본 문자열에는 영향을 주지 않는다.
       * */
      String str6 = "java";
      String str7 = "oracle";

      System.out.println("concat() : " + (str6.concat(str7)));			//javaoracle
      System.out.println("str6 : " + str6);




      /* indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
       * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
       * */
      String indexOf = "java oracle";

      System.out.println("indexOf('a') : "  + indexOf.indexOf('a'));		//1
      System.out.println("indexOf('z') : " + indexOf.indexOf('z'));		//-1

      /* lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
       * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
       * */
      System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));		//7
      System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z'));		//-1














    }
  }
}

