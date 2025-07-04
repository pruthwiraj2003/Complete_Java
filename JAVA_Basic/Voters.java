
// A person is eligibile for vote if his/ her age is hgrater than equal to 18.Define a methord to find out if he / she eligible to vote .
import java.util.Scanner;
public class Voters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int a = sc.nextInt();
        Voters(a);

    }
    static void Voters(int age ){
        if(age>18){
            System.out.println("Congratulation You are eligible for vote ");

        }
        else {
            System.out.println("Sorry you are not eliguble for vote ");
        }
    }
    
}
