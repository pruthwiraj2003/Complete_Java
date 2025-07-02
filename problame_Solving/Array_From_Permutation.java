
import java.util.Arrays;

// Given a zero based pemutation nums (o-index) build an array of the same length where 

public class Array_From_Permutation {
    public static void main(String[] args) {
        int [] nums={0,2,1,5,3,4};
        int ans []=new int[6];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
    
}
