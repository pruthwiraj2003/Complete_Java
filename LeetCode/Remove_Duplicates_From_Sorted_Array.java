// Given an integer numay nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,2]

public class Remove_Duplicates_From_Sorted_numay {
    public static void main(String[] args) {
        int num[]={1,2,3,3,4};
        System.out.println(sort(num));
         
        
    }
    static int sort(int num[]){
        int i =0;
        while(i<num.length){
            int cnumect=num[i]-1;
            if(num[i]!=num[cnumect]){
                swap(num,i,cnumect);
            }else{
                i++;
            }

        }
        return num.length;
    }
    static void swap(int num[],int first,int second){
        int temp=num[first];
        num[first]=num[second];
        num[second]=temp;
    }
    
}
