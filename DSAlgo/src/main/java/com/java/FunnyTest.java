package com.java;

public class FunnyTest {

    public static void main(String[] args) {

        try {
            System.out.println(FunnyMath.divide(1,0));
        } catch (FunnyException e) {
            e.printStackTrace();
        }
    }
}

class FunnyMath {

    public static int divide(int num1, int num2) throws FunnyException{
        if(num2 == 0)
            throw new FunnyException();
        else
            return num1/num2;
    }
}

class FunnyException extends Exception {
}
