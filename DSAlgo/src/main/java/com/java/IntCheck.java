package com.java;

public class IntCheck {

    public static void main(String[] args) {
        int a = 1000;
        Integer b = 1000;
        Integer c = new Integer(1000);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println(b.equals(c));
        System.out.println(b.equals(a));
    }
}
