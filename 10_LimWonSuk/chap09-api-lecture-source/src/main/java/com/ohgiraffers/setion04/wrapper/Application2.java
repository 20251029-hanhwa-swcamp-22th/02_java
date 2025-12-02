package com.ohgiraffers.setion04.wrapper;

public class Application2
{
    public static void main(String[] args)
    {
     /*Warpper Class 종류 == 기본 자료형 종류
     * 전부 대문자로 바꾸고 약어는 파싱으로 바꾸면 다됨
     * parsing : String(문자열) 값을 다른 원하는 자료형/형태로 바뀌는것
     * */

        /*문자열 -> 기본자료형 parsing*/
        byte b = Byte.parseByte("1"); // 문자열 "1" -> (byte) 1
        short s = Short.parseShort("2"); // 문자열 "2" -> (Short) 2
        int i = Integer.parseInt("3"); // 문자열 "2" -> (Short) 2
        long l = Long.parseLong("4"); // 문자열 "2" -> (Short) 2
        float f = Float.parseFloat("4.0"); // 문자열 "2" -> (Short) 2
        double d = Double.parseDouble("8.0"); // 문자열 "2" -> (Short) 2
        boolean isTrue = Boolean.parseBoolean("True");
        // Chatater는 parsing 기능 제공 x (이미 잘쓰고있는거 있어서)
        // char cg = Charater.parseChar("C")
       // char ch = Character.PARAGRAPHCHAR("234")
    }
}
