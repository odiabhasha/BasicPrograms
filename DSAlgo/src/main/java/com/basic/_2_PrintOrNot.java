package com.basic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class _2_PrintOrNot {

    public static void main(String[] args) {
        System.out.println("Enter the number you want to Check");
        Scanner scanner = new Scanner(System.in);
        Integer integer = scanner.nextInt();

        boolean prime = true;
        for(int i=2;i<integer;i++){
            if(integer % i == 0){
                prime = false;
            }
        }

    }
}
