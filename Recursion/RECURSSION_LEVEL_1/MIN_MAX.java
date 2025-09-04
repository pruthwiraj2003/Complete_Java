// Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.
// Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
// Output: min = -5, max = 8
import java.util.Scanner;
public class MIN_MAX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the length of the array :" +n);
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Minimum of the given array is "+min(arr, n));

        
    }
    static int min(int arr[],int n){
         
        if(n==1){
            return arr[0];
        }
        int temp = min(arr , n-1);
        if(arr[n-1]< temp){
            return arr[n-1];
        }else{
            return temp;
        }


        
    }
    
}
