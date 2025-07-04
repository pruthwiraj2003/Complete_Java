// Find the year is leap year or not by using users input .

import java.util.Scanner;
public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year = sc.nextInt();
        if(year%4==0|| year%400==0){
            System.out.println("Entered Year is a leap year ");
        }
        else{
            System.out.println("Entered year is not a leap year ");
        }

    }
    
}
