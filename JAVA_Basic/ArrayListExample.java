import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer>list=new ArrayList<>(10);

        // list.add(47);
        // list.add(2);
        // list.add(7);
        // list.add(4);
        // list.add(467);
        // list.add(947);
        // list.add(407);
        // list.add(47);
        // list.add(2);
        // list.add(7);
        // System.out.println(list.contains(2));
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        for(int i =0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i =0;i<5;i++){
            System.out.print(list.get(i)); // pass index here 
        }
        // System.out.println(list);



    }
    
}
