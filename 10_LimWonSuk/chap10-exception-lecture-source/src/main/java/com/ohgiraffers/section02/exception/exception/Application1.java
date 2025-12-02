package com.ohgiraffers.section02.exception.exception;


public class Application1
{
    public static void main(String[] args) throws Exception {
        ExceptionTest et = new ExceptionTest();


        try
        {
           // et.checkEnoughMoney(-30000,-10000);
           // et.checkEnoughMoney(30000,-10000);
            et.checkEnoughMoney(30000,5000);
         //   et.checkEnoughMoney(12354,0);
        }
       catch(PriceNegativeException e)
       {
           System.err.println(e.getMessage());
        //   e.printStackTrace();
       }
        catch(MoneyNegativeException e)
        {
            System.err.println(e.getMessage());
        }
        catch (NegativeException e)
        {
            System.out.println(e.getMessage());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        ;
    }
}
