// define a methord whether a number vis prime or not 
import java.util.Scanner;
public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        prime(num);

        
    }
    static void prime(int n){
        for(int i =1;i<n;i++){
            if(n%i==0){
                System.out.println("Entered number is a prime number ");
            }
            else{
                System.out.println("Entered number is not a prime number ");
            }
        }
    }
    
}
