package com.algo.insertation_sort;

public class SelectionSort {

    public static int[] sort(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int cMin = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j] < arr[cMin])
                    cMin = j;
            }
            int temp = arr[cMin];
            arr[cMin] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] array = {8,5,3,9,1,5};

        System.out.println("Before Sorting");
        for(int i : array){
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("After Sorting");
        for(int i : sort(array)){
            System.out.print(i);
        }
    }
}
