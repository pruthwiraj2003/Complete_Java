import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Total_Run :");
        double Total_Run = sc.nextDouble();
        System.out.println("Enter No of times out :");
        double No_Out = sc.nextDouble();
        double Batting_Average = Total_Run/No_Out;
        System.out.println(Batting_Average);
    }
    
}
