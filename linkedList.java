import java.util.*;
public class linkedList {

private class node {
  String value; //element 
  Node next; // reference to successor
  Node prev; // reference to predecessor 
  
  /**
   constructor.
   @param val the element to store in this node.
   @param n the reference to the next node.
   @param p the reference to the prev node.
   */
  
  Node (String val, Node n, Node p) {
  value = val;
  next = n;
  prev = p;
  }
  
  Node (String val) {
  value = val;
  next = null;
  prev = null;
  }
}

//Referencing the first node in the list
private Node first = null; 

/**
constructor
build linked list
*/

public linkedList() {

//incrementally build list
//Alphabetical order of names 
//Cherry Orange Peach Strawberry

first = new Node ("Peach");
first.next = new Node ("Strawberry");
first.next.next = new Node ("Orange");
first = new Node ("Cherry", first);

String [] names = {"Apple", "Banana"};

//use loop to add Apple and Banana to the front of the linked list 
//to build the list
//Apple Banana Cherry Orange Peach Strawberry

for (String s: names)
   first = new Node(s, first);
   }




  
  

    