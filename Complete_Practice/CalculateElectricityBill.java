// Calculate Electricity Bill
import java.util.Scanner;
public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many electric consume :");
        int unit=sc.nextInt();
        System.out.print("How Many days :");
        int days=sc.nextInt();
        double total;
        if(unit>=1 && unit<=50){
            double p1 =3.00;
            total=unit*days*p1;
            System.out.println("Total electric"+unit+" bill in this"+days+" :"+total);

        }else if(unit>50 && unit<=100){
            double p2=4.50;
            total = unit*days*p2;
            System.out.println("Total electric"+unit+" bill in this"+days+" :"+total);

                
        }else if (unit>100 && unit<=200) {
            double p3=6.00;
            total = unit*days*p3;
            System.out.println("Total electric"+unit+" bill in this"+days+" :"+total);

        }else if(unit>200 && unit<=300){
            double p3=7.00;
            total =unit*days*p3;
            System.out.println("Total electric"+unit+" bill in this"+days+" :"+total);

        }else{
            double p4=8.00;
            total =unit*days*p4;
            System.out.println("Total electric"+unit+" bill in this"+days+" :"+total);

        }
        
    }
    
}
