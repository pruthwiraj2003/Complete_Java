// write a proogram to print the circummeferance and area of two numbers entered by the user by defining your own methord .
import java.util.Scanner ;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double pi =3.14;
        System.out.print("Enter the value of radius :" );
        int radius = sc.nextInt();
        int result =Area_Circumferance(radius, pi);
        



        
    }
    static int Area_Circumferance(int r,double pi){
        Scanner sc = new Scanner(System.in);
        
        pi =3.14;
        double Area = pi*r*r;
        System.out.println(Area);
        return 0;
        
    }

    
}
