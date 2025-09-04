
import java.util.Arrays;

public class Reverse{
  public static void main(String[] args){
    int [] arr={1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    // int left=0;
    // int right = arr.length-1;
    // while(left<right){
    //   int temp=arr[left];
    //   arr[left]=arr[right];
    //   arr[right]=temp;
    //   left ++;
    //   right--;
    // }
    // System.out.println(Arrays.toString(arr));
    // int newarr[]=new int[n];
    // for(int i =0;i<n;i++){
    //   newarr[i]=arr[n-1-i];
    // }
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(newarr));
    reverse(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
    

  }
   static void reverse(int arr[],int left,int right){
    if(left>=right){
      return;
    }
    int temp =arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    reverse(arr, left+1, right-1);

  }
  
  
}