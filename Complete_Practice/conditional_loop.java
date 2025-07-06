// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class conditional_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int sum =0;
        System.out.println("Enter 0 if you want to add all entered number ");
        while(true){
            num=sc.nextInt();
            if(num==0){
                break;
            }else{
                sum+=num;
            }
        }
        System.out.println("Sum of the entered number is "+sum);
        
    }
    
}

