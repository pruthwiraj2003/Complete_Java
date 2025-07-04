// Find wheather 14 exist in array or not .
import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={23, 45, 1, 2, 4,19,-3,-8,-11};
        int key =19;
        int ans = linera(num, key);
        System.out.println("Key found at index :"+ans);
        
              
    }

    static int linera(int arr[],int target){
        if(arr.length ==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }

        }
        return 0;

    }

}