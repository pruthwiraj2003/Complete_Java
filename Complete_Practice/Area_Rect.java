// Area Of Rectangle Program
import java.util.Scanner;
public class Area_Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length & breath of a rectange 'l' ;'b'");
        double l =sc.nextDouble();
        double b=sc.nextDouble();
        double Area = l*b;
        System.out.println(Area);
    }
    
}
