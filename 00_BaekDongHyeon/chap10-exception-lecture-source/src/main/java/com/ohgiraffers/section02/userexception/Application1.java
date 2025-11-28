package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();

    try{
      //et.checkEnoughMoney(-30000, 10000); // PriceNegativeException
      //et.checkEnoughMoney(30000, -10000); // MoneyNegativeException
      et.checkEnoughMoney(30000, 5000); // NegativeException

    } catch (PriceNegativeException e) {
      //e.printStackTrace();
      System.err.println(e.getMessage());

    } catch (MoneyNegativeException e){
      System.err.println(e.getMessage());

    } catch (NegativeException e){
      System.err.println(e.getMessage());
    }
    catch (Exception e){
      e.printStackTrace();
    }


  }
}
