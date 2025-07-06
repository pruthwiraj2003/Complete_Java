// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int num ;
    int largest=Integer.MIN_VALUE;
    while(true){
        System.out.println("Enter number ");
        num= sc.nextInt();
        if(num ==0){
            break;
        }
        if(num>largest){
            largest=num;
        }
    }
    if(largest==Integer.MAX_VALUE){
        System.out.println("No number is entered ");

    }else{
        System.out.println("The largest number is "+largest);
    }

    }
    
}
