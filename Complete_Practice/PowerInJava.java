// Power In Java
import java.util.Scanner;
public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer the base :");
        double Base = sc.nextDouble();
        System.out.println("Enter the exponent");
        double exponent= sc.nextDouble();
        System.out.println(Math.pow(Base, exponent));


    }
}
