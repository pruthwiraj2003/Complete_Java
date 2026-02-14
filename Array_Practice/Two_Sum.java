public class Two_Sum {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,78};
    int target = 3;
    for(int i =0;i<arr.length;i++){
      for(int j =i+1;j<arr.length-1;j++){
        if(arr[i]+arr[j]==target){
          System.out.println("Sum of index "+i+" And "+j+"= "+target);
        }
      }
    }
    // System.out.println("Invalid");
  }
}
