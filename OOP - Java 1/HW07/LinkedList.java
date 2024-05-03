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

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return this.size;
  }
}