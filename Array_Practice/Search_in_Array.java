import java.util.Scanner;
public class Search_in_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr = {10,12,13,14,15};
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    for(int i =0;i<arr.length;i++){
      if(arr[i]==n){
        System.out.println("Entered Number Found At index "+i);
      }
      
    }
    System.out.println("Entered Number is Not At Any Index");
  }
}
