package com.home;

import com.home.models.LinkedList;

public class Main {

  public static void main(String[] args) {
    LinkedList linkedList=new LinkedList();
    linkedList.addLast(20);
    linkedList.addLast(30);
    linkedList.addFirst(10);
    linkedList.print();
    //System.out.println(linkedList.indexOf(30));
    linkedList.removeFirst();
    linkedList.removeLast();
    linkedList.print();
  }
}
