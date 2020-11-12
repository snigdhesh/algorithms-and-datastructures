package com.home.models;

public class LinkedList {
  private Node first;
  private Node last;

  public void addFirst(int item) {
    Node node = new Node(item);
    if (isEmpty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }
  }

  public void addLast(int item) {
    Node node = new Node(item);
    if (isEmpty())
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
  }

  private boolean isEmpty() {
    return first == null ? true : false;
  }

  public void print() {
    System.out.println("{");
    if (first != null)
      System.out.println("First=" + first);
    if (last != null)
      System.out.println("Last=" + last);
    System.out.println("}");
  }

  public boolean contains(int item) {
    return indexOf(item) != -1;
  }

  public void removeFirst() {
    //what if first is null? or what if list is empty?
    //what if second is null?
    if (first != null) {
      Node node = first;
      first = first.next;
      node.next = null;
    } else {
      System.out.println("List is empty");
    }

  }

  public int indexOf(int item) {
    int index = 0;
    Node current = first;
    while (current != null) {
      if (current.value == item)
        return index;
      index++;
      current = current.next;
    }
    return -1;
  }

}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "[" +
      "value=" + value +
      ", next=" + next +
      ']';
  }
}
