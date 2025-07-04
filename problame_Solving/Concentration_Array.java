
import java.util.Arrays;

// Given an intiger array nums of length n you want to craeat an array ans of length 2n where abs [i ]==nums[i]

public class Concentration_Array {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int ans []=new int[2*arr.length];
        for(int i =0;i<arr.length;i++){
            ans[i]=arr[i];
            ans[arr.length+i]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }

    
}
