public class Range {
    public static void main(String[] args){
        int arr []= {34,56,78,90,23,45};
      System.out.println(MaxRange(arr , 2,6));


    }
    static int MaxRange(int[]arr, int start,int end){
        int maxVal=arr[start];
        for(int i= start;i<=end;i++){
            
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
