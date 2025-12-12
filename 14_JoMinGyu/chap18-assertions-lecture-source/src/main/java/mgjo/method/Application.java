package mgjo.method;

import java.io.InputStream;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    System.out.println("main start");
    String str = callMe();
    System.out.println(str);
    System.out.println("main end");
  }

  protected static String callMe() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = sc.nextLine();
    System.out.println("안녕, BMI " + calculateBmi() + "인 " + name + " 반가워!");
    if()
    return str;
  }

  static float calculateBmi() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your height in m: ");
    float height = sc.nextFloat();
    sc.nextLine();
    System.out.println("Please enter your weight in kg: ");
    float weight = sc.nextFloat();
    sc.nextLine();
    float bmi = weight / (height * height);
    return bmi;
  }

}
