
import java.util.Arrays;

// Given an array nums containing n distinct number in the range[0,n] return the only number in the range that is missing from the array 
// Example:- inputs={3,0,1} output:2 


public class Missing_Number {
    public static void main(String[] args) {
        int [] arr={3,0,1};
        System.out.println(Arrays.toString(arr));
         int res=sort(arr);
        System.out.println(res);
        
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){ 
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr ,i, correct);

            }
            else{
                i++;
            }
            
        }
        for(int index=0;index<arr.length;index++){
                if(arr[index]!=index){
                    return index;
                }

            }
        return arr.length; 
    }
    static void swap(int []arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
