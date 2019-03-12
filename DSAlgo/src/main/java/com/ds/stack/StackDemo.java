package com.ds.stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(55);
        stack.push(67);
        System.out.println(stack.toString());

        stack.pop();
        stack.pop();
        System.out.println(stack.toString());

        System.out.println(stack.peek());
    }
}
