// Take two number and print the suum of the both 
import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2;
        System.out.print("Enter the num1: ");
        num1=sc.nextInt();
        System.out.println("Enter the num2");
        num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum of" +num1+ "and" +num2+ "is =" +sum);


        
    }
    
}
