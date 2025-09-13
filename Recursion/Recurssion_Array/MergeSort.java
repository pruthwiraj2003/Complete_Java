import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
      int arr []={1 , 5, 6, 4, 8, 9, 4, 3, 2};
      arr=mergsort(arr);
      System.out.println(Arrays.toString(arr));
  }
  static int[] mergsort( int arr[]){
    if(arr.length==1){
      return arr;
    }
    int mid =arr.length/2;
    int [] left = mergsort(Arrays.copyOfRange(arr, 0, mid));
    int [] right = mergsort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(arr, right, left);
  }
  private static int [] merge(int [] arr, int[] first, int[] second){
    int mix [] = new int [first.length + second.length];
    int i =0;
    int j =0;
    int k =0;
    while(i< first.length && j< second.length){
      if(first[i]<second[j]){
        mix[k]=first[i];
        i++;
      }else{
        mix[k] = second[j];
        j++;
      }
      k++;
    }
    while(i<first.length){
      mix[k]=first[i];
      i++;
      k++;
    }
    while(j<second.length){
      mix[k]=second[j];
      j++;
      k++;
    }
    return mix;
  }
  
}
