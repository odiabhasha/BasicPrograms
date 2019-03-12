package com.tricky;


class Inter1 {
    protected static String VAR = "";
}

class Inter2 extends Inter1 {

}


public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Inter2.VAR);
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);

        long d1 = 10*3000L;
        long d2 = 33*200;
    }
}
