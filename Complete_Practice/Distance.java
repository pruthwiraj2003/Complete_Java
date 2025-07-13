// Calculate Distance Between Two Points
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the x1 , x2 , y2, y2");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(Dist(x1, x2, y1, y2));
        
    }
    
    static int Dist(int x1,int x2, int y1, int y2){
        if(x1>x2 && y1>y2) return (int)(Math.sqrt(Math.pow(x1-x2 , 2)+Math.pow(y1 - y2 , 2)));
        
        
        return (int)(Math.sqrt(Math.pow(x2-x1 , 2)+Math.pow(y2 - y1 , 2)));
    }
}