class Node{
  int data;
   Node next;

    public Node(int data) {
      this.data = data;
    }
   
}
class linkedlist{
  Node head;
  Node tail;
  int size;
  void LLDisplay(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
      
    }
    System.out.println();

    
  }
  
  void addTail(int x){
    Node temp  = new Node(x);
    if(tail == null){
      tail = head = temp;
      size++;
      return;
    }else{
      tail.next=temp;
      tail = temp;
    }
    size++;

  }
  void addHead(int x){
    Node temp = new Node(x);
    if(head == null){
      head = tail = temp; 
      size++;
    }else{

      temp.next = head;
      head = temp;
    }
    size++;

  }
  void addAtIndex(int val, int idx){
    Node n1 = new Node(val);
    if(idx<0 || idx>size){
      System.out.println("Invalid Index");
      return;
    }
    Node temp = head;
    if(idx ==0){
      n1.next= head;
      size++;
    }
    for(int i =0;i<idx-1;i++){
      temp=temp.next;
    }
    temp.next = n1;
    n1.next= temp.next.next;
    size++;

  }
  void deleteLast(){
    if(head == null){
      System.out.println("LindesList is Invalid ");
      return;
    }
    if(head.next ==null){
      head =null;
      size--;
    }
    Node temp = head;
    while(temp.next.next!=null){
      temp = temp.next;
    }
    temp.next = null;
    size--;

  }
  void deleteAthead(){
    if(head == null){
      System.out.println("LinedList is empty");
    }else{
      head = head.next;
      size--;
    }
  }
  void deleteIndex(int idx){
    if(idx<0 || idx>size){
      System.out.println("Invalid Index");
      return;
    }
    if(idx ==0){
      head = head.next;
      size--;
    }
    Node temp = head;
    for(int i =0;i<idx-1;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;

  }

}
public class PracticeLinkedList {
  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.addTail(11);
    ll.addTail(12);
    ll.addTail(13);
    ll.addTail(14);
    ll.LLDisplay();
    ll.addHead(10);
    
    ll.LLDisplay();
    // ll.deleteAthead();
    // ll.LLDisplay();
    // ll.deleteLast();
    // ll.LLDisplay();
    // ll.deleteIndex(3);
    ll.addAtIndex(12, 4);
    ll.LLDisplay();
  System.out.println(ll.size);
    
  }
}
