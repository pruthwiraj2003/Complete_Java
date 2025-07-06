// Factorial Program In Java
import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.println(n);
        }
        for(int i =1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        
    }
}
