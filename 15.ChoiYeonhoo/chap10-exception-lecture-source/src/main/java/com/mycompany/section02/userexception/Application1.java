package com.mycompany.section02.userexception;

import com.mycompany.section02.userexception.exception.MoneyNegativeException;
import com.mycompany.section02.userexception.exception.NegativeException;
import com.mycompany.section02.userexception.exception.NotEnoughException;
import com.mycompany.section02.userexception.exception.PriceNegativeException;

public class Application1 {
  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();

    try{
//      et.checkEnoughMoney(-30000,-10000);
//      et.checkEnoughMoney(30000,-10000);
      et.checkEnoughMoney(30000,5000);
    }
    catch (PriceNegativeException e){
      System.err.println(e.getMessage()); // 에러 출력 구문이 조금 느려서 나중에 줄이 나옴
    }
    catch (MoneyNegativeException e){
      System.err.println(e.getMessage());
    }
    catch (NegativeException e){
      System.err.println(e.getMessage());
    } catch (NotEnoughException e) {
      throw new RuntimeException(e);
    }
  }
}
