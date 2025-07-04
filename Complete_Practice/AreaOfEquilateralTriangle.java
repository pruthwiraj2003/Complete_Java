import java.util.Scanner;
// Area Of Equilateral Triangle
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if(a==b && b==c){
            System.out.println("Enter the height of the triangle ");
            int h = sc.nextInt();
            int base=b;
            double Area = 1.0/2*(base*h);
            System.out.println("Area of the equlateral triangle is "+Area);
        }else{
            System.out.println("entered  sides of the triangle is not equal so it's caculated in anotherc way ");
            int s =(a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        
    }
    
}
