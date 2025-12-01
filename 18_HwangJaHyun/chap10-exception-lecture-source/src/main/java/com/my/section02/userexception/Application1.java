package com.my.section02.userexception;

import com.my.section02.userexception.exception.MoneyNegativeException;
import com.my.section02.userexception.exception.NegativeException;
import com.my.section02.userexception.exception.PriceNegativeException;

public class Application1 {

  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();

    try {
      //et.checkEnoughMoney(-30000, -10000);
      //et.checkEnoughMoney(-1234, 0);
      //et.checkEnoughMoney(30000, -10000); // PriceNegaticeException
      //et.checkEnoughMoney(30000, -10000);// MoneyNegativeException
      et.checkEnoughMoney(30000, 5000); // NegativeException
    } catch (PriceNegativeException e) {
      System.out.println(e.getMessage());
      // e.printStackTrace(); // 오류 정보 출력
      System.err.println(e.getMessage());
    } catch(MoneyNegativeException e) {
      System.err.println(e.getMessage());
    } catch(NegativeException e){
      System.err.println(e.getMessage());
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
