// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
/*
{1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5]
 */

import java.util.Arrays;

public class Sum_Triangle{
    public static void main(String[] args) {
      int arr [] = {1 ,2, 3,4,5};
      sumTriangle(arr);
      
  }
  static void sumTriangle(int[]arr){

    if(arr.length==1){
      System.out.println(Arrays.toString(arr));
      return;
    }
    int temp[] = new int[arr.length-1];
    for(int i =0;i<arr.length-1;i++){
      temp[i] = arr[i]+arr[i+1];
    }
    sumTriangle(temp);
    System.out.println(Arrays.toString(arr));

  }
}