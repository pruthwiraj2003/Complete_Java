
import java.util.Arrays;

// 1. Sort an Array of 1 to N
// Problem: Given an array of size n containing numbers from 1 to n with no duplicates, sort it using cyclic sort.

// Input: [3, 1, 5, 4, 2]
// Output: [1, 2, 3, 4, 5]



public class Sort_An_Array {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
