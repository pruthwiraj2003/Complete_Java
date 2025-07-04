// Volume Of Cone Java Program
import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  PI =22.0/7;
        System.out.println("The value Of the Pi Is " +PI);
        System.out.println("Enter the radius of the cone :");
        int radius = sc.nextInt();
        System.out.println("Enter the height of the triangle :");
        int height=sc.nextInt();
        double volume = 1.0/3*(PI)*(radius*radius*radius)*height;
        System.out.println("Volume of the cone is" +volume);
    }
    
}
