package com.basic;

public class _1_FibonacciSeries {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int sum = 0;
        for(int i = 1; i <= 10 ;i++){
            System.out.println(num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
    // Series of numbers where each number is the sum of its two previous proceeding numbers.
}
