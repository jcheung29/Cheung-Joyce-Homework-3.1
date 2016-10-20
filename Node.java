public class Node {
  private String data;
  private Node next; // reference to successor
  private Node prev; // reference to predecessor 
  
  Node (String x) {
    this.data = x;
    this.next = null;
    this.prev = null; 
  }
  
  //Insert getters and setters
  public String getData() {
  return this.data;
  }
  
  public void setData(String newData) {
  this.data = newData;
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
  }


  
  