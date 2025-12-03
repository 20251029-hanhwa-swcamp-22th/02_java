package section05.time;

public class LoveJHH {
  public static void main(String[] args) {
    int[] codes = new int[] {
        (9 << 3),
        (25 << 2) + 1,
        (27 << 2),
        (27 << 2),
        (37 << 1) + 37,
        (11 << 2),
        (1 << 5),
        (11 << 3) - 1,
        (37 << 1) + 37,
        (57 << 1),
        (27 << 2),
        (25 << 2),
        (1 << 5) + 1
    };

    char[] chars = new char[codes.length];
    for (int i = 0; i < codes.length; i++) {
      chars[i] = (char) codes[i];
    }

    System.out.println(new String(chars));
  }
}