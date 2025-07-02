// Find the maximum and minimum element in an array 
import java.util.Scanner;
public class Proble_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        

        

    } 
    static void Max(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is "+max);

    }   
    
        


        
    

    
}
