
import java.util.LinkedList;
import java.util.Queue;


public class QueueMain {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(34);
    q.add(78);
    q.add(56);
    q.add(67);
    // dispaly(q);
    addIndex(q, 3, 60);
    
  }

  private static void dispaly(Queue<Integer> q){
      int n = q.size();
    for(int i = 0;i<n;i++){
      System.out.print(q.peek()+" ");
      q.add(q.remove());
    }

    
  }

  private static void addIndex(Queue<Integer> q,int idx,int val){

    Queue<Integer> temp = new LinkedList<>();

    for(int i = 0;i<idx;i++){
      temp.add(q.remove());
    }
    temp.add(val);
    while(!q.isEmpty()){
      temp.add(q.remove());
    }

    while(!temp.isEmpty()){
      q.add(temp.remove());
    }

    System.out.println(q);

  }

  private static int peek(Queue<Integer> q,int idx){
    return -1;
  }
  
}

class queue{
  
}
