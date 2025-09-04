// Armstrong Number In Java
// 
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int sum =0;
        while(number > 0){
            number/=10;
            count++;
            number %=10;
        
        }
        System.out.println(count);
        
    }
    
}
