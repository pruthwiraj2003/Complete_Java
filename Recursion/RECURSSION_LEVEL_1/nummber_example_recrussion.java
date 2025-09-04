// What is recrussion :-A function that call itself.


public class nummber_example_recrussion {
    public static void main(String[] args) {
        // write a functionthat takes in a nnumber and points it 
        // print first 5 number :1 2 3 4 5
        print(1);
    }
    static void print(int n ){
        if(n==5){ // base condition 
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    
}
