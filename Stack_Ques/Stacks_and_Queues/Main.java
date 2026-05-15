import java.util.*;

public class Main{
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();

//        stack.push(34);
//        stack.push(23);
//        stack.push(42);
//        stack.push(65);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//                queue.add(3);
//                queue.add(4);
//                queue.add(5);
//                queue.add(6);
//                queue.add(7);
//                queue.add(8);
//                queue.add(9);
//                System.out.println(queue.remove());
//                System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(78);
        deque.removeFirst();
        deque.removeLast();


    }
}