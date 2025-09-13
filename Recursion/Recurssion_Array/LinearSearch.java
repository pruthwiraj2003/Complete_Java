
import java.util.ArrayList;

public class LinearSearch {
  public static void main(String[] args) {
      int arr[]={2 , 3 , 1, 4 ,4 ,5
      };
      System.out.println(search(arr,15,0));
      findAllIndex(arr, 4, 0);
      System.out.println(list);
  }
  static boolean search (int arr[],int key,int index){
    if(index == arr.length){
      return false;
    }
    return arr[index]==key || search(arr, key, index+1);
    
  }
   static ArrayList<Integer> list = new  ArrayList<>();
  static void findAllIndex(int[] arr, int target,int index){
    if(index == arr.length){
      return;
    }
    if(arr[index]==target){
      list.add(index);
    }
    findAllIndex(arr, target, index+1);
  }
}
