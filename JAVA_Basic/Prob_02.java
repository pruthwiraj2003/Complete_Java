// Take a number as input and print the multiplication table for it .
import java.util.Scanner;
public class Prob_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nummber you want to print the table of this number ");
        int num = sc.nextInt();
        for(int i =1;i<=10;i++){
            int result=num*i;
            System.out.println(+num+ "X"+i+"="+result);
        }

    }

    
}
