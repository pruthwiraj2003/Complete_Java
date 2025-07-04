// Write a program to search for a given number in an array using linear search.
import java.util.Arrays;
import java.util.Scanner;
public class Problamr_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[7];
        int key =sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                key=arr[i];
                System.out.println("Key found at index "+i);
            }
        }

    }
}