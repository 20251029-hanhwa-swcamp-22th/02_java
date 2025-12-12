package mgjo.method;

public class Application1 {

  public static void main(String[] args) {
    System.out.println("main start");
    callMe();
  }

  protected static String callMe() {
    return "Hello World!";
  }

  static float calculateBmi() {
    return 0;
  }

}
