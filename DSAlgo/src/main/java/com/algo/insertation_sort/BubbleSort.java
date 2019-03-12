package com.algo.insertation_sort;

public class BubbleSort {

    public static int [] bubbleSort(int[] arr){

        int n = arr.length;
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-i-1;j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,3,6,1,4,2,7};
        System.out.println("Before Sort");
        for(int i : arr){
            System.out.print(i);
        }
        System.out.println(" ");
        System.out.println("After Sort");
        for (int i:bubbleSort(arr)){
            System.out.print(i);
        }
    }
}
