package com.home;

import com.home.models.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        //linkedList.addLast(20);
        //linkedList.addLast(30);
        //linkedList.addFirst(10);
        System.out.println("List before swap: ");
        linkedList.print();

        linkedList.swapNodes(linkedList.first, 30, 50);
        System.out.println("List after swap: ");
        linkedList.print();
        //System.out.println(linkedList.indexOf(30));
        //linkedList.removeFirst();
        //linkedList.print();
    }
}
