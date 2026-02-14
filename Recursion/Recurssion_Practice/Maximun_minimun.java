import java.util.Arrays;

public class Maximun_minimun {
  public static void main(String[] args) {
    int[] arr = {4,3,2,21,1,5,6};
    System.out.println(max(arr,0));
    System.out.println(min(arr, 0));
  }
  static int max(int arr[],int index){
      if(index==arr.length-1){
        return arr[index];
      }
      int maxele = max(arr,index+1);

      return Math.max(arr[index],maxele);
  }

  static int min(int[]arr,int index){
    if(index==arr.length-1){
        return arr[index];
    }

    int minele = min(arr, index+1);

    return Math.min(arr[index] ,minele);
  }
}
