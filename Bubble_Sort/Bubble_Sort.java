// BUBBLE SORT: - always bubble up the correct element into the last position of the array 
import java.util.Arrays;
public class Bubble_Sort {
  public static void main(String[] args) {
    int arr[] ={1,3,4,2,5};
    Sorted(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void Sorted(int arr[]){
    for(int i =0;i<arr.length;i++){
      for(int j =1;j<arr.length;j++){
        if(arr[j]<arr[j-1]){
          int temp= arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;

        }
      }
    }
  }
}
