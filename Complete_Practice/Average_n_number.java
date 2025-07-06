// Calculate Average Of N Numbers
import java.util.Scanner;
public class Average_n_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        double sum =0;
        double Average;
        // for(int i =1;i<=N;i++){
        //     sum =sum+i;
        // }
        // Average=sum/N;
        // System.out.println(sum);
        // System.out.println(Average);
        // Other way to calculate Average of first N number 
        sum =N*(N+1)/2;
        System.out.println(sum);
        Average=sum/N;
        System.out.println(Average);
    }
    
}
