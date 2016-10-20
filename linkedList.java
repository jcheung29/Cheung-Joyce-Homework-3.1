import java.util.*;
public class linkedList {

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

first = null;

}

public void add(String node)
{
Node word = new Node(node);

if (first == null)
    first = word; 
    
else 
{
Node pointer = first; 
int compare = pointer.getData().compareTo(word.getData());
if (compare == 0)
{

if (pointer.getNext() == null) {
   pointer.setNext(word); 
   word.setPrev(pointer);
   }
else {
  word.setNext(pointer.getNext());
  word.setPrev(pointer);
  pointer.getNext().setPrev(word);
  pointer.setNext(word); 
}
}

if (compare > 0) {
  word.setNext(pointer);
  pointer.setPrev(word);
  first = word; 
}

if (compare < 0) {
  if (pointer.getNext() == null) {
    pointer.setNext(word);
    word.setprev(pointer);
}
  else {
    
while (pointer.getNext() != null) {
  pointer = pointer.getNext();
  
  if (compare == 0)
{

if (pointer.getNext() == null) {
   pointer.setNext(word); 
   word.setPrev(pointer);
   }
else {
  word.setNext(pointer.getNext());
  word.setPrev(pointer);
  pointer.getNext().setPrev(word);
  pointer.setNext(word); 
}
}

if (compare > 0) {
  word.setNext(pointer);
  word.setPrev(pointer.setPrev); 
  pointer.setPrev(word);
}

if (compare < 0) {
  pointer.getNext() == null;

  
}


}
}
}

public void print() {

Node ref = first;
while (ref!= null) {
System.out.print(ref.value + " ");
ref = ref.next;
}
}

public static void main(String [] args)
{
linkedList 11 = new linkedList();
String str = "The list consists of:";
System.out.println(str);
11.print();
}
}






  
  

    