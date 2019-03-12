package com.ds.stack;

public class StackUsingLinkedList {

    private Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.link = top;
        top = node;
    }

    public Node pop(){
        this.top = this.top.link;
        return this.top;
    }



}
