public class Print_Negativ_Number {
  public static void main(String[] args){
    int [] arr ={12,1,2,3,4,45};
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        System.out.print(arr[i]+" ");
      }
    }
    int sum =0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    // System.out.println(sum);
    int max = arr[0];
    for(int i =0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    System.out.println(max);
  }
  
}
