import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  []arr=new int[5];
        // arr[0]=23;
        // arr[1]=45;
        // arr[2]=263;
        // arr[3]=485;
        // arr[4]=239;
        // arr[5]=455;
        // System.out.println(arr[1]);
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        // for(int num:arr){ // for every element in the array print the element  
        //     System.out.println(num+"  ");  // here num represent element of the array  
        // }
    }
    
}
