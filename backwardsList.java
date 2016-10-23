import java.util.*;
public class backwardsList {
  
//reference last node in the list
private Node last = null; 

  public backwardsList() {
  last = null;
  }
  
  public void add(String node) {
Node pointer = new Node(node);

if (last == null)
    last = pointer;
    
else 
{
Node word = pointer; 
int compare = word.getData().compareTo(pointer.getData());

if (compare == 0) {

if (word.getNext() == null) {
   word.setNext(word); 
   pointer.setPrev(word);
   }
else {
  pointer.setNext(word.getNext());
  pointer.setPrev(word);
  word.getNext().setPrev(pointer);
  word.setNext(pointer); 
}
}


if (compare > 0) {
  pointer.setNext(word);
  pointer.setPrev(pointer);
  last = pointer; 
}

if (compare < 0) {
  if (word.getNext() == null) {
    word.setNext(pointer);
    pointer.setPrev(word);
}
  else {
    
while (word.getNext() != null) {
  word = word.getNext();
  
  if (compare == 0)
{

     if (word.getNext() == null) {
         word.setNext(pointer); 
         pointer.setPrev(word);
         return;
         }
     else {
         pointer.setNext(word.getNext());
         pointer.setPrev(word);
         word.getNext().setPrev(pointer);
         word.setNext(pointer); 
         return;
         }
}

     if (compare > 0) {
        pointer.setNext(word);
        pointer.setPrev(word.getPrev());
        word.getPrev().setNext(pointer);
        word.setPrev(pointer);
        return;
        }

     if (compare < 0) {
        if (word.getNext() == null) {
            pointer.setPrev(word);
            word.setNext(pointer);
            return;
            }
      }
}
}
}
}
}
public void print() {
    Node pointer = last;
    while (pointer!= null) {
    System.out.print(pointer.getData() + " ");
    pointer = pointer.getPrev();
    }
}
}