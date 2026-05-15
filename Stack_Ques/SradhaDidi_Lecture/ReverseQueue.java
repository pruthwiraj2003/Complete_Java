import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    int n = q.size();
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<n;i++){
      stack.add(q.remove());
    }
    while(!stack.isEmpty()){
      q.add(stack.pop());
    }

    System.out.println(q);
  }

}
