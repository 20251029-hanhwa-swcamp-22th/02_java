package com.ohgiraffers.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {

        /* Wrapper Class type = primitive type */

        /* String -> primitive type */
        byte b = Byte.parseByte("1"); // "1" -> (byte)1

        short s = Short.parseShort("2"); // "2" -> (short)2

        int i = Integer.parseInt("3");

        long l = Long.parseLong("8"); // "8" -> (long)8

        float f = Float.parseFloat("1.32");

        double d = Double.parseDouble("2.34");

        boolean isTrue = Boolean.parseBoolean("true");

        char c = "c".charAt(0); // Character는 parsing기능을 제공하지 않는다
    }
}
