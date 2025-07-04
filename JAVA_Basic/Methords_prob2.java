// Define a program to find a given  ju ber is even or odd.

import java.util.Scanner;
public class Methords_prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num =sc.nextInt();
        odd(num);

    }
    static int odd(int a){
        if(a%2==0){
            System.out.println("Enterd number is a  even number ");
        }
        else {
            System.out.println("Entered number is a  odd number ");
        }

        return 0;

    }
    
}
