// WAP to input n element into an array and display them .
import java . util .Scanner ;
public class Prob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n =sc.nextInt();
        int []arr=new int [n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // System.out.println(java.util.Arrays.toString(arr));
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }


}