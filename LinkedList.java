package com.bl.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.insertFirst(70);
        singleLinkedList.insertFirst(30);
        singleLinkedList.insertFirst(56);


        singleLinkedList.printNodeElement();
    }

}
