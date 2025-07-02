// Area Of Circle Java Program
import java.util.Scanner;
public class Area_Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        int r = sc.nextInt();
        System.out.println("Enter the value of 'PI'");
        double PI=sc.nextDouble();
        System.out.println("Area of the Circle is ");
        double Area= PI*r*r;
        System.out.println(Area);
        sc.close();
    }
}