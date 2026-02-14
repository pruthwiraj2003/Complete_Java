import java.util.*;
public class Sort0s1s {
  public static void main(String[] args) {
    int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
    // int temp[] = new int[arr.length];
    // int zero = 0;
    // int one =0;
    // int two =0;
    // int i =0;
    // while(i<arr.length){
    //   if(arr[i] ==0){
    //     zero++;
    //   }else if (arr[i]==1) {
    //       one++;
    //   }else{
    //     two++;
    //   }
    //   i++;
    // }
    // // System.out.println(one+" " +two+" "+zero+" ");
    // int l =0;
    // for(int j =0;j<zero;j++){
    //   temp[l] = 0;
    //   l++;
    // }
    // for(int j =0;j<one;j++){
    //   temp[l] = 1;
    //   l++;
    // }
    // for(int j =0;j<two;j++){
    //   temp[l] = 2;
    //   l++;
    // }
    // System.out.println(Arrays.toString(temp));
    
    sort(arr);

  }
  static void sort(int arr[]){
    int low = 0 , mid =0, high = arr.length-1;
    while(mid<=high){
      if(arr[mid] == 0){
          swap(arr,low, mid);
          low++;
          mid++;
      }else if(arr[mid]==1){
        mid++;
      }else{
        swap(arr, mid , high);
        high--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  static void swap(int arr[] , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
