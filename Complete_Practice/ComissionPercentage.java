// Calculate Commission Percentage
import java.util.Scanner;
public class ComissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(":Enter total sales");
        double Total_Sale = sc.nextDouble();
        System.out.println("Enter commission Earned");
        double Comission_Earned = sc.nextDouble();
        double Comission =  (Comission_Earned/Total_Sale)*100;

        System.out.println("You earnd total Comission : \n " +Comission);
    }
    
}
