package com.ohgiraffers.section02.exception.exception;


import java.io.NotActiveException;

public class Application3
{
    public static void main(String[] args) throws Exception
    {
        ExceptionTest et = new ExceptionTest();


        try
        {
            // et.checkEnoughMoney(-30000,-10000);
            // et.checkEnoughMoney(30000,-10000);
            et.checkEnoughMoney(30000,5000);
            //   et.checkEnoughMoney(12354,0);
        }
        catch(NegativeException | NotEnoughException e)
        {
            /* | : 동일한 레벩의 서로 다른 예외를 하나의 catch애 작성할 수 있게하는 구문.
            * 당, 상위 타입(부모)을 같이 작성할 순는 없다.
            * */

            System.err.println(e.getMessage());

        }
  /*      catch(NotActiveException e)
        {
            System.err.println(e.getMessage());
        }*/

        }
        ;
    }
