
import java.util.Arrays;

// Given an array nums .We define a running sum of an array as runningSum[i]==sum(nums[0]..nums[i]).

public class Running_Sum_Of_Id_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int ans[] = new int [5];
        ans[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            ans[i]=ans[i-1]+arr[i];
            
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
