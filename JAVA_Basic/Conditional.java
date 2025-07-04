import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        // int num =1;
        // while(num<=5){
        //     System.out.println(num);
        //     num+=1;

        // }
        // int n =1;
        // do { 
        //     System.out.println("Hello Amar ");
        //     n++;
            
        // } while (n!=1);
        //  Print the Largest Number Among 3 number 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is the gratest number among three number ");

        }
        else if (b>a&& b>c) {
            System.out.println("b is thegratest number among three number ");
            
        }
        else{
        System.out.println("C is the gratest number among three number ");
        }


        
    }
    
}
