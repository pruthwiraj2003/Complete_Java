// Finding the Sum of Digits of a Number Until Zero 
// Ex:-123=1+2+3=6
import java.util.Scanner;
public class Sum_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which is grater than zero:");
        int num=sc.nextInt();
        int sum =0;
        
        while(num>0){
         int rem=num%10;
         sum+=rem;
          num=num/10;
        }
        System.out.println(sum);
     
     

        sc.close();
    }
    
    
}