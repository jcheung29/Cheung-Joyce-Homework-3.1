public class Main {
  
  public static void main(String [] arg) {
    linkedList L1List = new linkedList();
    backwardsList BkwdList = new backwardsList();
    
      L1List.add("Apple");
      L1List.add("Banana");
      L1List.add("Cherry");
      L1List.add("Orange");
      L1List.add("Peach");
      L1List.print();  
      
      BkwdList.add("Apple");
      BkwdList.add("Banana");
      BkwdList.add("Cherry");
      BkwdList.add("Orange");
      BkwdList.add("Peach");
      BkwdList.print();
      
  }
}