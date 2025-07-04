// Area Of Isosceles Triangle
import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the two  equal side of  a triangle");
        double  a=sc.nextInt();
        double base=sc.nextInt();
        System.out.println("Ente height of the triangle ");
        double height=sc.nextDouble();
        double Area = (1/2)*base*height;
        System.out.println(Area);

    }
    
}
