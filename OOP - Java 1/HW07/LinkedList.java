import java.util.NoSuchElementException;

public class Linkedlist implements List<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public Node<T> getHead() {
    return this.head;
  }
  public Node<T> getTail() {
    return this.tail;
  }

  public void addAtIndex(T data, int index) {
    if (index < 0 || isEmpty()) {
      throw IllegalArgumentException("Your index is out of the list bounds");
    } else if (data == null) {
      throw IllegalArgumentException("You cannot add null data to the list");
    }
    Node<T> nodeToAdd = new Node<T>(data);

    Node<T> current = head;
    Node<T> prev = null;
    int i = 0;
    while (i != index) {
      prev = current;
      current = current.next;
      i++;
    }
    
    prev.next = nodeToAdd;
    nodeToAdd.next = current;
    if (index == 0) {
      head = nodeToAdd;
    }
    if (index == size()) {
      tail = nodeToAdd;
    }
    size++;
  }

  public T getAtIndex(int index) {
    if (index < 0 || index > size()) {
      throw IllegalArgumentException("Your index is out of the list bounds");
    }
    Node<T> current = head;
    int i = 0;
    while (i != index) {
      current = current.next;
      i++;
    }

    return current.data;
  }

  public T removeAtIndex(int index) {
    if (index < 0 || index > size()) {
      throw IllegalArgumentException("Your index is out of the list bounds");
    }

    Node<T> prev = null;
    Node<T> current = head;
    int i = 0;
    while (i != index) {
      prev = current;
      current = current.next;
      i++;
    }
    T removedData = current.data;
    prev.next = current.next;
    size--;
    
    if (index == 0) {
      head = head.next;
    }
    if (index == size()) {
      tail = prev.next;
    }

    return removedData;
  }

  



  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return this.size;
  }
}