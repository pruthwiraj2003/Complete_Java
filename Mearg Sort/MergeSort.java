
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){

    }
    static int[]mergesort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length)) ;

        return mergesort(left,right);
    }
    private static int [] merge(int []left,int[]right){
        int [] mix=new int[first.length+second.length];
        

    }
}