// Given an integer nuay nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,2]

public class Remove_Duplicates_From_Sorted_nuay {
    public static void main(String[] args) {
        int nums[]={1,2,3,3,4};
        System.out.println(sort(nums));
         
        
    }
    static int sort(int nums[]){
        int i =0;
        while(i<nums.length){
            int cnuect=nums[i]-1;
            if(nums[i]!=nums[cnuect]){
                swap(nums,i,cnuect);
            }else{
                i++;
            }

        }
        return nums.length;
    }
    static void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    
}
