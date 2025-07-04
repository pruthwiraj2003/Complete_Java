// Perimeter Of Parallelogram
import java .util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side's of Parallelogram :");
        int a =sc.nextInt();
        int b =sc.nextInt();
        double Perimeter=1.0/2*(a+b);
        System.out.println("Perimeter Of Parallelogram " + Perimeter);

    }
    
}
