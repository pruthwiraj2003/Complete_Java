// Area Of Triangle 
import java.util.Scanner;
public class Area_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side :");
        double a =sc.nextDouble();
        System.out.println("Enter the second side :");
        double  b=sc.nextDouble();
        System.out.println("Enter the first side :");
        double c =sc.nextDouble();
        
        if(a+b>c && c>a-b){
            System.out.println("Half-perimeter of the triangle is ");
            double s = (a+b+c)/2;
            System.out.println("It is a proper Triangle ");
             double Area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

            System.out.println(Area);
        }else{
            System.out.println("It is not a triangle");
        }
        
    }
    
}
