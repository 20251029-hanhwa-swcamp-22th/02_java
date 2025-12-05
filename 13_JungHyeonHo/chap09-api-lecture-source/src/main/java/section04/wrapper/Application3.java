package section04.wrapper;

public class Application3 {
  public static void main(String[] args) {

    /* parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다. */
    byte b = Byte.parseByte("1");
    short s = Short.parseShort("2");
    int i = Integer.parseInt("4");
    long l = Long.parseLong("8");      //8L은 안됨
    float f = Float.parseFloat("4.0");    //4.0f는 됨
    double d = Double.parseDouble("8.0");
    boolean bl = Boolean.parseBoolean("true");

    /* Character는 parsing 기능을 제공하지 않는다. */
    char c = "abc".charAt(0);

    /* parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요하다. */

    /* valueOf() : 기본자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
     * toString() : 필드값을 문자열로 반환하는 메소드
     * */
    String b2 = Byte.valueOf((byte) 1).toString();
    String s2 = Short.valueOf((short) 2).toString();
    String i2 = Integer.valueOf(4).toString();
    String l2 = Long.valueOf(8L).toString();
    String f2 = Float.valueOf(4.0f).toString();
    String d2 = Double.valueOf(8.0).toString();
    String bl2 = Boolean.valueOf(true).toString();
    String c2 = Character.valueOf('a').toString();

    /* String클래스의 valueOf를 사용할 수도 있다. */
    String str = String.valueOf(10);

    /* 문자열 합치기를 이용해 String으로 변환할 수도 있다. */
    String str2 = 123 + "";
  }
}
