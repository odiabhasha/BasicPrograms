package com.ds.linked_list;

public class LinkedListDemo {

    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(7);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(20);
        linkedList.insertAtHead(22);
        System.out.println(linkedList);
        System.out.println("Length is : "+linkedList.length());
        linkedList.deleteFromHead();

        System.out.println(linkedList);
        System.out.println("Length is : "+linkedList.length());
        // \u000d System.out.println("Comment Executed");
    }
}
