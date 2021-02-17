package org.webcharmtechs;

public class Model {

    public float addition(long num1, long num2){
        return num1 + num2;
    }

    public float subtraction(long num1, long num2){
        return num1 - num2;
    }

    public float multiplication(long num1, long num2){
        return num1 * num2;
    }

    public float division(long num1, long num2){
        try{
            float res =  num1 / num2;
            return res;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }
   
}
