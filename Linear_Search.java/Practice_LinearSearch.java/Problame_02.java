// Give an array of n integer and a target value X,find the index of x using linear search .
import java.util.Arrays;
import java.util.Scanner;
public class Problame_02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element in the given Arrays:");
    int ele=sc.nextInt();
    System.out.println("Enter the Key(X):");
    int X= sc.nextInt();
    int []arr=new int[ele];
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }        
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        if(arr[i]==X){
            X=arr[i];
            System.out.println("Entered element found at index :"+i);

        }
    }
    }
    
}
