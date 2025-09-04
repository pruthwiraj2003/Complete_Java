public class String_Reverse {
  public static void main(String[] args) {
    String str ="ANITA";
    char [] arr= str.toCharArray();
    int left =0;
    int right=arr.length-1;
    while(left<right){
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right]  = temp;
      left++;
      right--;
    }
    System.out.println(str);
    String reversd = new String(arr);
    System.out.println(reversd);
  }
  
}
