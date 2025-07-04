// Area Of Parallelogram
import java. util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the two equal side of a paralleleogram ");
         int side1=sc.nextInt();
         int side2=sc.nextInt();
         double Area = 1.0/2*(side1+side2);
         System.out.println("Area of the parallelogram is :"+Area); 
         sc.close();
    }
    
}
