public class Node {
  private int data;
  private Node next; // reference to successor
  private Node prev; // reference to predecessor 
  
  Node (int x) {
    this.data = x;
    this.next = null;
    this.prev = null; 
  }
  
  //Insert getters and setters
  public int getData() {
  return this.data;
  }
  
  public void setData(int newData) {
  this.data = new Data;
  }
  
  public Node getPrev() {
  return this.prev;
  }
  
  public void setPrev(Node newPrev) {
  this.prev = newPrev;
  }
  
  public Node getNext() {
  return this.next;
  }
  
  public void setNext(Node newNext) {
  this.next = newNext;
  }
  