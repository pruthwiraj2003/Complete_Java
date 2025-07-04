
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String message=greeting();
        // System.out.println(message);
        System.out.println("Enter your Name :"); 
        String name = sc.next();
        String personalised =mygreet(name);
        System.out.println(personalised);

    }
    static String mygreet(String name){
        String message ="Hello "+name;
        return message; 

    }

    static String greeting(){
        String greet ="How are you Brother !!!!"; 
        return greet;

    }
    
}
