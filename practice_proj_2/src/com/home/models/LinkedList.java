package com.home.models;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LinkedList {
    public Node first;
    public Node last;

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

    //This method switches nodes directly, without changing data.
//Actual: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70  Expected: 10 -> 20 -> 50 -> 40 -> 30 -> 60 -> 70
/* Function to swap nodes x and y in linked list by
changing links */
   public void swapNodes(Node head, int x, int y) {
// Nothing to do if x and y are same
        if (x == y) return;

// Search for x (keep track of prevX and CurrX
        Node prevX = null, currX = head;
        while (currX != null && currX.value != x) {
            prevX = currX;
            currX = currX.next;
        }

// Search for y (keep track of prevY and CurrY
        Node prevY = null, currY = head;
        while (currY != null && currY.value != y) {
            prevY = currY;
            currY = currY.next;
        }

     System.out.println("currx="+currX);
     System.out.println("curry="+currY);
     System.out.println("prevx="+prevX);
     System.out.println("prevY="+prevY);
// If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

// If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else // Else make y as new head
            head = currY;
// If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // Else make x as new head
            head = currX;

     System.out.println("prevx.next="+prevX);
     //System.out.println("prevY.next="+prevY);

     System.out.println("currY="+currY);
     //System.out.println("currX="+currX);
// Swap next pointers
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
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
