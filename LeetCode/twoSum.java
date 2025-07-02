// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class twoSum{
    public static void main(String[] args) {
         int num[]={2,7,11,15};
        int target=9;
        for(int i=0;i<num.length;i++){
            if(num[i]+num[i+1]==target){
                System.out.println("["+i+" "+i+"]");
            }
        }

        
        
    }
    
}