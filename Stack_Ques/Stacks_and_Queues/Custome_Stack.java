public class Custome_Stack {
    protected  int[] data;
    private static final int DEFULT_SIZE=10;

    int ptr = -1;


    public Custome_Stack(){
        this(DEFULT_SIZE);
    }
    Custome_Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]= item;

        return true;

    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int remover = data[ptr];

        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack !");
        }
        return data[ptr];
    }
    private boolean isFull() {

        return ptr == data.length-1;
    }


    private boolean isEmpty(){
        return ptr == -1;
    }

}
