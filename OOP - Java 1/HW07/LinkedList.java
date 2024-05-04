import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
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
    if (index < 0 || index > size()) {
      throw new IllegalArgumentException("Your index is out of the list bounds");
    } else if (data == null) {
      throw new IllegalArgumentException("You cannot add null data to the list");
    }
    Node<T> newNode = new Node<T>(data);

    if (index == 0) {
      newNode.setNext(head);
      head = newNode;
      if (size == 0) {
        tail = newNode;
      }
    } else {
      Node<T> current = head;
      Node<T> prev = null;
      int i = 0;
      while (i != index) {
        prev = current;
        current = current.getNext();
        i++;
      }
      
      prev.setNext(newNode);
      newNode.setNext(current);
      if (index == size()) {
        tail = newNode;
      }
    }
    size++;
  }

  public T getAtIndex(int index) {
    if (index < 0 || index >= size()) {
      throw new IllegalArgumentException("Your index is out of the list bounds");
    }
    Node<T> current = head;
    int i = 0;
    while (i != index) {
      current = current.getNext();
      i++;
    }

    return current.getData();
  }

  public T removeAtIndex(int index) {
    if (index < 0 || index >= size()) {
      throw new IllegalArgumentException("Your index is out of the list bounds");
    }

    Node<T> removedNode = head;
    
    if (index == 0) {
      removedNode = head;
      head = head.getNext();
      if (size() == 1) {
        tail = null;
      }
    } else {
      Node<T> prev = head;
      int i = 0;
      while (i < index - 1) {
        prev = prev.getNext();
        i++;
      }
      removedNode = prev.getNext();
      prev.setNext(removedNode.getNext());
      
      if (index == size() - 1) {
        tail = prev;
      }
    }
    
    size--;
    return removedNode.getData();
  }

  public T remove(T data) {
    if (data == null) {
      throw new IllegalArgumentException("You cannot remove null data from this list");
    }
    Node<T> prev = null;
    Node<T> current = head;
    while (current != null) {
      if (current.getData().equals(data)) {
        T removedData = current.getData();
        
        if (prev == null) {
          head = head.getNext();

          if (size() == 1) {
            tail = null;
          }
        } else {
          prev.setNext(current.getNext());
          if (current.getNext() == null) {
            tail = prev;
          }
        }
        
        size--;
        return removedData;
      }
      prev = current;
      current = current.getNext();
    }

    throw new NoSuchElementException("The data is not present in the list");
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  public int size() {
    return this.size;
  }
}