class  Node{
  int val;
  Node next;
  Node(int val){
    this.val = val;
  }
}
class Linkedlist{
  Node head;
  Node tail;
  int size;
  int search(int val){
    if(head == null) return -1;
    Node temp = head;
    int idx =0;
    while(temp!=null){
      if(temp.val== val) return idx;
      temp = temp.next;
      idx++;
    }
    return -1;
  }
  void addAtTail(int val){
    Node temp = new Node(val);
    if(tail == null){
      head = tail = temp;
    }else{

      tail.next = temp;
      tail = temp;
    }
    size++;

  }
  void deleteAtHead(){
    if(head == null){
      System.out.println("Invalid ");
      return;
    }
      head = head.next;
      if(head == null) tail = null;
      size--;
      System.out.println();
  }
  void addAtHead(int val){
    Node temp = new Node(val);
    if(head ==null) head = tail = temp;
    else{

      temp.next = head;
      head = temp;
    }
    size++;
  }
  void insertAtIndex(int val, int idx){
    if(idx<0 || idx>size){
      System.out.println("Invalid index");
      return;
    }
    Node node = new Node(val);
    Node temp = head;
    if(idx==0){
      node.next = head;

      head = node;
      size++;
    }
    
    for(int i =0;i<idx-1;i++){
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next  = node;
    size++;
  }
  int get(int idx){
    Node temp  = head;
    for(int i =0;i<=idx;i++){
      temp = temp.next;
    }
    return temp.val;
  }
  void deleteEnd(){
    if(head == null){
      System.out.println("LindesList is Invalid ");
      return;
    }
    Node temp = head;
    
    if(temp.next ==null){
      head = null;
      size--;
    }
    while(temp.next.next !=null){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;

  }
  void deleteAtIndex(int idx){
    if(idx<0 || idx> size){
      System.out.println("Invalid Index");
      return;
    }
    Node temp = head;
    if(idx == 0){
      head = head.next;
      size--;
    }
    for(int i =0;i<idx-1;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;
  }
  
  void display(){
    if(head == null) return ;
    Node temp = head;
    while(temp!= null){
      System.out.print(temp.val+" ");
      temp = temp.next;

    }
    System.out.println();
  }

}

public class LinkedListDataStructer {
  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    // ll.deleteAtHead();
    ll.addAtTail(10);
    ll.addAtTail(20);
    ll.addAtTail(30);
    ll.addAtTail(40);
    ll.addAtTail(50);
    // ll.display();
    ll.addAtHead(1);
    ll.display();
    // ll.deleteAthead();
    // System.out.println(ll.search(40));
    ll.insertAtIndex(60, 3);
    // ll.deleteAtIndex(3);
    ll.deleteEnd();
    ll.display();
    // System.out.println(ll.get(3));
  
    
  }
  
}

// LinkedList Limitation :-
/*
get is O(n) time 
 */
