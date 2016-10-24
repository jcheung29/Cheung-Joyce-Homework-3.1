/**
 * Joyce Cheung
 * ICSI 213
 * Dr. Magnus
 * Assignment 3.2
 **/

import java.util.*;
public class linkedList {

//Referencing the first node in the list
private Node first = null; 
private Node last = null;

public linkedList() {

first = null;
last = null;

}

public void add(String node) {
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


if (compare > 0) {
  word.setNext(pointer);
  pointer.setPrev(word);
  first = word; 
}

if (compare < 0) {
  if (pointer.getNext() == null) {
    pointer.setNext(word);
    word.setPrev(pointer);
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
        word.setPrev(pointer.getPrev());
        pointer.getPrev().setNext(word);
        pointer.setPrev(word);
        
        return;
        }

     if (compare < 0) {
        if (pointer.getNext() == null) {
            word.setPrev(pointer);
            pointer.setNext(word);
            return;
            }
      }  
}
}
}
}
}

public void sub(String node) { 
Node pointer = new Node(node);

  if (last == null)
    last = pointer;
    
else 
{
Node word = first; 
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

public void forward() {
    Node pointer = first;
    while (pointer.getNext() != null) {
    System.out.print(pointer.getData() + " ");
    pointer = pointer.getNext();
    }
}
    public void backward() {
    Node word = first;
    while (word.getPrev() != null) {
    System.out.print(word.getData() + " ");
    word = word.getPrev(); 
    }
}
}










  










  
  

    