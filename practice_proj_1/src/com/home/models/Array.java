package com.home.models;

import java.util.Arrays;

public class Array {

  private int[] items;

  int count = 0;

  public Array(int arrayLength) {
    this.items = new int[arrayLength];
  }

  public void insert(int item) {
    if (count == this.items.length) {
      int[] newItems = new int[count * 2];
      for (int i = 0; i < items.length; i++) {
        newItems[i] = items[i];
      }
      items = newItems;
    }
    items[count++] = item;
  }

  public void removeAt(int index) throws IllegalAccessException {
    if (index < 0 || index >= count) {
      throw new IllegalAccessException("Invalid index");
    }
    for (int i = index; i < items.length - 1; i++) {
      items[i] = items[i + 1];
    }
    count--;
  }

  public void insertAt(int item, int index) throws IllegalAccessException {
    if (index < 0 || index >= count) {
      throw new IllegalAccessException("Invalid index. Index can be between 0 and " + count);
    }

    if (count < items.length) {
      int[] newItems = new int[items.length];
      for (int i = 0; i < items.length; i++) {
        newItems[i] = items[i];
      }
      for (int i = index; i < count; i++) {
        items[i + 1] = newItems[i];
      }
      items[index] = item;
    }
        /*We are throwing an exception in case when index is out of range, so exception is thrown even when array is full.
        But if we want to test insertAt() method, when array is full, following code helps.
        else {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
            insertAt(item, index);
        }*/

  }

  public int indexOf(int item) {
    for (int i = 0; i < items.length; i++) {
      if (item == this.items[i]) {
        return i;
      }
    }
    return -1;
  }

  public int max() {
    Arrays.sort(items);
    return items[items.length - 1];
  }

  public void reverse() {
    int[] newItems = new int[count];
    int index = count - 1;
    for (int i = 0; i < count; i++) {
      newItems[i] = items[index--];
    }
    items = newItems;
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }
}
