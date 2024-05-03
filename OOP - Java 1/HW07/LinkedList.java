import java.util.List;

public class Linkedlist implements List<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  public LinkedList() {
    this.head = null;
    this.tail = null;
  }

  public Node<T> getHead() {
    return this.head;
  }
  public Node<T> getTail() {
    return this.tail;
  }
}