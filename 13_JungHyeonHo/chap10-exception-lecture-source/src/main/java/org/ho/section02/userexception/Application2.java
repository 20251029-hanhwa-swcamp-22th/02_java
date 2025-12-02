package org.ho.section02.userexception;

import org.ho.section02.userexception.exception.MoneyNegativeException;
import org.ho.section02.userexception.exception.NegativeException;
import org.ho.section02.userexception.exception.PriceNegativeException;

public class Application2 {
  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();


    try {
      et.checkEnoughMoney(-2000,-10000); //PriceNegativeException
      et.checkEnoughMoney(2000,-3000);    //MoneyNegativeException
      et.checkEnoughMoney(30000, 5000);   //NegativeException
      et.checkEnoughMoney(1000,20000);
    } catch (PriceNegativeException e) {
      System.err.println(e.getMessage());
    } catch (MoneyNegativeException e) {
      System.err.println(e.getMessage());
    }
    catch (NegativeException e) {
      System.err.println(e.getMessage());
    }
    catch(Exception e) {}

  }
}
