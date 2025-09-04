// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
import java.util.Arrays;

public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        sumTriangle(arr);
    }
    static void  sumTriangle(int [] arr){
        if(arr.length<1){
            return ;
        }
        int temp [] = new int[arr.length-1];
        for(int i =0;i<arr.length-1;i++){
            int x =arr[i]+arr[i+1];
            temp[i] =x;

        }

        sumTriangle(temp);

        System.out.println(Arrays.toString(arr));
    }
    
}
