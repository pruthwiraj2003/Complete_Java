// Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n)
// Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term
// Input: n = 4
// Output: 2.083333
// Explanation: Sum of the series is 1 + 1/2 + 1/3 + 1/4 ≈ 2.083333.


import java.util.Scanner;
public class Mathamatical_Computation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        double sum=0.0;
        for(int i =1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println(sum);
        
         

    }
    
    
}
