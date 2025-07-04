// Calculate the sum and average of the elements of the given array 
import java.util.Scanner;
public class Sum_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

            
        }
        int sum=0;
        int Average;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            Average=sum/n;
            
        }
        System.out.println();
        System.out.println("Sum of the Arrays Element is "+sum);


        
    }
    
}
