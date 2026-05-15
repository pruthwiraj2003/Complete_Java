class Node{
  int val ;
  Node next;

  public Node(int val){
    this.val = val;
  }
  

}

public class DisplayList {

  public static void displayrec(Node head){
    if(head==null){
      
      return ;
    }
    System.out.print(head.val+" ->");
    displayrec(head.next);


  }
  public static void display(Node head){
      Node temp = head ;
      while(temp !=null){
        System.out.print(temp.val+" ->");
        temp = temp.next;
      }
      System.out.println();
  }
  public static int index(Node head, int idx){
      Node temp = head;
      for(int i =0;i<idx;i++){
        temp = temp.next;
      }
      return temp.val;
  }
  public static void main(String[] args) {
    Node a =new Node(10);   
    Node b =new Node(20);  
    Node c =new Node(30);  
    Node d =new Node(40);  
    Node e =new Node(50); 
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    // e.next = null;
    // display(a);
    displayrec(a);
    System.out.println();
    System.out.println(index(a, 3));

  }
  
}
