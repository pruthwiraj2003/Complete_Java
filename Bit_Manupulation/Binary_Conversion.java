
import java.util.Scanner;

public class Binary_Conversion{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    String binary =" ";
    int num = sc.nextInt();
    while(num>0){
      if(num%2==1){
        binary+='1';
      }else{
        binary+='0';
      }
      num/=2;

      
    }
    String result = reverse(binary);
    
    System.out.println(result);

  }
  static String reverse(String binary ){
    StringBuilder sb = new StringBuilder(binary);
    
    return sb.reverse().toString();
  }

}