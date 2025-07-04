// Finding the Sum of the First N Odd Numbers
// Difficulty: Easy
// Topics: Mathematical Computations
// Description: Write a program to calculate the sum of the first N odd numbers.
// Example:
// Input: N = 5
// Output: 25
// Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.


import java.util.Scanner;
public class Sum_Of_odd_numbers{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N =sc.nextInt();
        int sum =0;
        int count=0;
        int number =1;
        while(count<5){
            sum+=number;
            number+=2;
            count++;
            System.out.println(sum);
        }
    

    }
    

}