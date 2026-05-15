public class Main{
  public static void main(String[] args) {
    Stacks stack = new Stacks();
    stack.push(10);
    stack.Display();
    stack.push(12);
    stack.Display();
    stack.push(45);
    stack.Display();
    stack.push(27);
    stack.Display();
    System.out.println(stack.top());
    stack.pop();
    stack.Display();
    System.out.println(stack.top());


  }

}
class Stacks{

   public  int arr[]  = new int[10];
  int top = -1;
  public void push(int val){

    if(arr.length ==0){
      System.out.println("Stack Overflow ");
      return ;
    }
    top++;
    arr[top] = val;

  }
  public void pop(){
    if(top==-1){
      System.out.println("Stack  UnderFlow");
    }
    top--;
  }

  public int top(){

    if(top==-1){
      System.out.println("Stack is Empty");

      return -1;
    }

    return arr[top];

  }
  public void Display(){
    if(top ==-1){
      System.out.println("Stacks is Empty");
    }
    for(int i = top;i>=0;i--){
      System.out.print(arr[i]+"->");
    }
    System.out.println();

  }

   boolean isEmpty() {
    if(arr.length == 0){

      
      return true;
    }

    return false ;
  }

}