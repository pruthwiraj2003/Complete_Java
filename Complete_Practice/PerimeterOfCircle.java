// Perimeter Of Circle
import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI =22.0/7;
        System.out.println("Enter the radius of the circle :");
        int radius = sc.nextInt();
        double Perimeter=2*PI*radius;
        System.out.println("Perimeter Of Circle : "+Perimeter);
    }
    
}
