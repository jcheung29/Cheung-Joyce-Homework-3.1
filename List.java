public class List {

Node head;
Node tail; 

//constructor
List () {
this.head = null;
this.tail = null; 
}

//Insert getters and setters
public Node getHead() {
return this.head;
}

public void setHead(Node newHead) {
    if (this.head == this.tail)
      this.tail = newHead;
    this.head = newHead;
  }

public Node getTail() {
return this.tail;
}

public void setTail(Node newTail) {
    if (this.head == this.tail)
      this.head = newTail;
    this.tail = newTail;
  }
  
//

