
import java.util.Arrays;

public class SUM_Triangle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sum(arr);        
    }
    static void  sum(int arr[]){
      if(arr.length<1) return;
        int[] temp =new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            int x=arr[i]+arr[i+1];
            temp[i]=x;
        }
        sum(temp);
        System.out.println(Arrays.toString(arr));
           
    }    
}
