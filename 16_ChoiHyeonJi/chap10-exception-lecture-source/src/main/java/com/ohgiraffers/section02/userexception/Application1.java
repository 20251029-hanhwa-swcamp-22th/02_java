package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();

    try {
      //et.checkEnoughMoney(-30000,-10000);
      //et.checkEnoughMoney(30000,-10000);
      et.checkEnoughMoney(30000, 5000);
      //et.checkEnoughMoney(1234,0);
    } catch (PriceNegativeException e) {
      //e.printStackTrace();
      System.err.println(e.getMessage()); //serr 에러메세지 출력 느려서 밑에 나옴
    } catch (MoneyNegativeException e) {
      System.err.println(e.getMessage());
    } catch (NegativeException e) {
      System.err.println(e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
