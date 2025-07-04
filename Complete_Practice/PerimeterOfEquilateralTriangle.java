// Perimeter Of Equilateral Triangle
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Perimeter=a+b+c;
        System.out.println("Perimeter Of Equilateral Triangle " +Perimeter);
        
    }
    
}
