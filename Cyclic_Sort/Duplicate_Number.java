
import java.util.Arrays;

// Given an array of nums containing n+1 intiger where each intiger is in the range [1,n] inclusive

public class Duplicate_Number {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(sort(nums));
        
        
    }
    static  int  sort(int nums[]){
        int i =0;
        while(i<nums.length){
            
            if(nums[i]!=i+1){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                swap(nums,i,correct);

               }
               else{
                return nums[i];
               }
                
            }else{
                i++;
            }
        }
        return -1;

    }
    static void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    
}
// 1:04:02