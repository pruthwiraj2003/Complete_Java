// Area Of Rhombus
import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonal of the Rhombus :");
        int d1=sc.nextInt();
        int d2= sc.nextInt();
        double Area = 1.0/2*(d1*d2);
        System.out.println("Area Of Rhombus="+Area);
    }
    
}
