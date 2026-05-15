class Node{
  int val ;
  Node next;
  Node(int val){
    this .val = val ;
  }
}
class linkedlist{
  Node head;
  Node tail;

    void addAtTail(int val){
      Node temp = new Node(val);
      if(tail==null){
        head = tail = temp;
      }
      tail.next = temp;
      tail = temp;

    }

    public void display() {
      Node temp = head;
      if(head ==null){
        return;
      }
      while(temp!= null){
        System.out.print(temp.val+" ->");
        temp = temp.next;

      }
    }
  
}

public class LinkedList_DataStructer {
  public static void main(String[] args) {
    linkedlist ll = new  linkedlist();
    ll.addAtTail(23);
    ll.addAtTail(24);
    ll.addAtTail(25);
    ll.addAtTail(26);
    ll.display();
       
  }
}
