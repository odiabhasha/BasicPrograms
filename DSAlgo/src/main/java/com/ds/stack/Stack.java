package com.ds.stack;

public class Stack {

    int array [];
    int top = -1;

    public Stack(int length){
        array = new int[length];
    }

    public void push(int data)
    {
        top++;
        array[top] = data;
    }

    public int pop()
    {
        int data ;
        data = array[top];
        array[top] = 0;
        top--;
        return data;
    }

    @Override
    public String toString() {
        String print = "";

        for(int val : array){
            print += val+", ";
        }
        return print;
    }

    public int peek() {
        int data ;
        data = array[top];
        return data;
    }
}
