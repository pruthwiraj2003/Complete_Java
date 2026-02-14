public class SelectionSort1 {
  public static void main(String[] args) {
      
  }

  static void SelectinSort(int arr[]){
    for(int i =0;i<arr.length;i++){
      int last = arr.length-i-1;
      int MaxIndex = getMaxIndex(arr,0,last);
      swap(arr,MaxIndex,last);
    }
  }

  static void swap(int[] arr, int first, int last) {
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
    
  }

 static int getMaxIndex(int[] arr, int start, int last) {
    int max = start;
    for(int i =0;i<=last;i++){
      if(arr[max]<arr[i]){
        max =i;
      }
    }

    return max;
  }
}
