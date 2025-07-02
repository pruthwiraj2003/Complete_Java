
import java.util.Arrays;

// Given an intiger array nums of length n while all the intiger of nums are in the range[1,n]and each intiger appears once or twice return ana array of all the intiger that  appears twice

public class All_Duplicate {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums));
        check(nums);
        System.out.println(check(nums));
        
    }
    static int sort(int nums[]){
        int i =0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
                
        }
        return -1;

    }
    static int  check(int nums[]){
        sort(nums);
        for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return nums[index+1];
                }
        }    
        return -1;
    }
    static void swap(int nums[],int first,int second){
        int temp =nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    
}
