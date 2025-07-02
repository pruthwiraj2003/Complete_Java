
import java.util.Arrays;

// you have a set of intigers s, which origianlly contains all the numbers from 1 to n.Unfortunately due to some error one of the numbers in s got duplicate to another numbers in the set, which results in repetion of one number and loss of another number .
// Find the number that occure twice and the number that is missing and return them in trhe front of an array 

public class Set_Mismatch {
    public static void main(String[] args) {
        int [] nums ={1,2,2,4};
        int [] result =sort(nums);
        System.out.println(Arrays.toString(result));
    
        
    }
    static int[] sort(int nums[]){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int []{-1,-1};
    }
    static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
}
