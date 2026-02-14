import java.util.Arrays;

public class MoveAllZerosToTheEnd {
  public static void main(String[] args) {
    int arr[] = {1,2,3,0,4,0,5,0};
    int temp[] = new int[arr.length];
    int j =0;
    for(int i =0;i<arr.length;i++){
      if(arr[i] != 0){
        temp[j] = arr[i];
        j++;
      }
    }
    // System.out.println(Arrays.toString(temp));
    movezeroes(arr);
  }
   static void movezeroes(int arr[]){
    int j =0;
    for(int i =0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[j] = arr[i];
        j++;
      }
    }
    System.out.println(j);
    while(j<arr.length){
      arr[j] = 0;
      j++;
    }
    System.out.println(Arrays.toString(arr));

  }
  
}
