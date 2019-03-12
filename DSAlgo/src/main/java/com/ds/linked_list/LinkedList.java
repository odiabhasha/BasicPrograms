package com.ds.linked_list;

public class LinkedList {

    private Node node;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.node);
        this.node = newNode;
    }

    public void deleteFromHead(){
        this.node = this.node.getNextNode();
    }

    public int length() {
        int length = 0;
        Node currentNode = this.node;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        Node currentNode = this.node;
        while (currentNode != null) {
            result += currentNode.getData() + " ,";
            currentNode = currentNode.getNextNode();
        }
        result += "}";
        return result;
    }
}

// NOTES:
/*

1. Each Item consists of 3 things (data, next pointer, previous pointer)
2. Last element has null next pointer, First element has null previous pointer.
3. First Node is called a HEAD.
4. By default Linked List holds the address of HEAD element.
5. Inserting a Node at HEAD: Point the new node next pointer to the first item, then point HEAD to the new Item. Takes constant time or O(1)
6. Deleting a Node from Head: Point the had to the next pointer, current head will be garbage collected . Takes constant time or O(1)
7. Searching an Element: Iterate through all the elements till find the item wants to search, if found return else continue till next node becomes
null. Time complexity is Linear, O(n)
8.

 */
