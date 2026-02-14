// Multiply odd index elemenbt by 2 and add 10 1o even indexed elements

import java.util.Arrays;

public class Multiplay_Odd_Even {
  public static void main(String[] args) {
      int [] arr = {10,12,14,89,90};
      System.out.println(Arrays.toString(arr));

      for(int i =0;i<arr.length;i++){
        if(i%2==0){
          arr[i]+=10;
        }else{
          arr[i]*=2;
        }
      }
      System.out.println(Arrays.toString(arr));

  }
  
}
