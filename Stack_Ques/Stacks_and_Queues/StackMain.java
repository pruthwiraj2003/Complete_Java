public class StackMain {
    public static void main(String[] args) throws StackException {
        Custome_Stack stack = new Custome_Stack(5);
        stack.push(34);
        stack.push(23);
        stack.push(42);
        stack.push(65);
        stack.push(90);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
