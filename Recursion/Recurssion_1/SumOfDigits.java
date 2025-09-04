import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(SOD(n));
    }
    static int SOD(int n){
        if(n< 1){
            return 0;
        }
         return (n%10)+SOD(n/10);
    }
    
}
