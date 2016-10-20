import java.util.*;
public class linkedList {

//Referencing the first node in the list
private Node first = null; 

public linkedList() {

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
if (compare == 0) {

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
         return;
         }
     else {
         word.setNext(pointer.getNext());
         word.setPrev(pointer);
         pointer.getNext().setPrev(word);
         pointer.setNext(word); 
         return;
         }
}

     if (compare > 0) {
        word.setNext(pointer);
        word.setPrev(pointer.setPrev); 
        pointer.setPrev(word);
        return;
        }

     if (compare < 0) {
        if (pointer.getNext() == null); {
            word.setPrev(pointer);
            pointer.setNext(word);
            return;
            }
      }
}
}
}

public void print() {
    Node pointer = first;
    while (pointer!= null) {
    System.out.print(pointer.value + " ");
    pointer = pointer.getNext;
    }
}








  
  

    