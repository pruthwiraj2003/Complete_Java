// Given an intiger  array nums return true if any value appears at least twice in the array , and return false if every element is distinct
import java.util.Arrays;
import java.util.Scanner;
public class Duplicate{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();  
    }
    System.out.println(Arrays.toString(arr));
    // System.out.println(duplicate(arr));
  }
  // static boolean duplicate(int arr[]){
  //   for(int i =0;i<arr.length;i++){
  //     for(int j =i+1;j<arr.length;j++){
  //       if(arr[i]==arr[j]){
  //         return true;
  //       }
  //     }
  //   }
  //   return false;
  // }
  static boolean sort(int[]arr){
      
  }
}