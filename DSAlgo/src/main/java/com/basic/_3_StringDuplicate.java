package com.basic;

public class _3_StringDuplicate {

    public static void main(String[] args) {
        String array [] = {"Java", "Android", "PHP", "Swift", "IOS","Java"};

        for(int i=0; i<array.length; i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if(array[i].equals(array[j]))
                {
                    System.out.println("Duplicate "+array[j]);
                }
            }
        }
    }
}
