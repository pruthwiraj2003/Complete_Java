import java.util.Scanner;
public class Function {
    //  Q: Take an input of two numbers and print the sum 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sum();
        //  sum2();
        // System.out.println(ans);
        int ans = sum3(5,7);
        System.out.println(ans);

    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 =sc.nextInt();
        
        System.out.print("Enter the Second  number :");
        int num2=sc.nextInt();

        int sum = num1+num2;
        System.out.println("The sum = "+sum);
        return sum;


    }
    static int sum3(int a,int b){
        int sum =a+b;
        return sum;

    }

     static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 =sc.nextInt();
        
        System.out.print("Enter the Second  number :");
        int num2=sc.nextInt();

        int sum = num1+num2;
        System.out.println("The sum = "+sum);

    }

    
}
