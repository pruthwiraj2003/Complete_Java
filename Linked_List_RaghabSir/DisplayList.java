class  Node{
  int val;
  Node next;
  Node(int val){
    this.val = val;
  }
}
public class DisplayList {

  public static void DisplayRecusively(Node head){
    if(head == null) return ;
    System.out.print(head.val+" ");
    DisplayRecusively(head.next);

  }
  static int get(Node head , int idx){
      Node temp = head;
      for(int i =1;i<=idx;i++){
        head = head.next;
      }
      return head.val;
    }
     
  public static void display(Node head){
    Node temp = head;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp = temp.next;
      }
  }
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    Node a = new Node(10); 
    Node b = new Node(12); 
    Node c = new Node(34); 
    Node d = new Node(45); 
    Node e = new Node(67); 
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;  
    System.out.println(get(a,2));
    // // e.next = null;
    // // display(a);
    // DisplayRecusively(a);
    
  }
  
}
