// Define two methord to print the mmaximum and the minimum number respectively among three number entered by the user .

import java.util.Scanner;

public class MethordsProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3 = sc.nextInt();
        min_Max(num1, num2, num3);
        min(num1, num2, num3);
        
    }

    static void min_Max(int a, int b, int c){
    Scanner sc = new Scanner(System.in);
        if(a>b && a>c){
            System.out.println(" 'a' is maximum");
        }
        else if(b>a && b>c){
            System.out.println(" 'b' is maximum");
        }
        else{
            System.out.println("'c' is maximum");
        }
    
    }
    static int min(int a, int b, int c){
        Scanner sc = new Scanner(System.in);
        if(a<b && a<c) {
            System.out.println("a is minimum");
        }
        else if(b< a && b<c){
            System.out.println("b is minimum");
        }
        else{
            System.out.println("c is minimum");
        }
        return 0;
    }

    
}

