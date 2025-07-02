// Finding All Pairs of Elements in an Array that Add Up to a Given Sum
// Write a program to find all pairs of elements in an array whose sum equals a specified target./
//Input: array = [1, 2, 3, 4, 5], target = 5
// Output: [(1, 4), (2, 3)]
// Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3)./
import java.util.Scanner;
public class Array_Targeted_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.println("Enter your target");
        int target=sc.nextInt();
        for(int i =0;i<arr.length;i++){
            for(int j=1+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+" "+arr[j]+")");

                }
            }


        }

    }    
}
