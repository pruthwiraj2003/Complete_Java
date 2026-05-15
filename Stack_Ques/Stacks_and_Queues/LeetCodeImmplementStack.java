import java.util.Stack;

public class LeetCodeImmplementStack {
    public static void main(String[] args) {
        QueueUsingStack stack1 = new QueueUsingStack();
        stack1.add(23);
        stack1.add(24);
        

    }
}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }
    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }
    public int peek() throws Exception{
       while(!first.isEmpty()){
           second.push(first.peek());
       }
       int peeked  = second.peek();
       while(!second.isEmpty()){
           first.push(second.pop());
       }

       return peeked ;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
