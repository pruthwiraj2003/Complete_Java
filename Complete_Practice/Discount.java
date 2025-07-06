// Calculate Discount Of Product
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price :");
        double price =sc.nextInt();
        System.out.print("Enter discount in percentage :");
        double Discount=sc.nextInt();
        double total =price*(Discount/100);
        System.out.println("Total discount " +total);
        double paid=price-total;
        System.out.println("To be paid " +paid);

    }
    
}
