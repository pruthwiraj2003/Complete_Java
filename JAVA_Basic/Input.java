import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int []arr=new int [5];
        // Arrays of premitives 
        arr[0]=23;
        arr[1]=45;
        arr[2]=233;
        arr[3]=543;
        arr[4]=3;
        // [23, 45, 233, 543, 3]
        // System.out.println(arr[3]);
        // input using for loop
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();

        // }
        // System.out.println(java.util.Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);

        // }
        // Arrays of objects 
        String[] str=new String[4];
        for(int i =0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(java.util.Arrays.toString(str));


        
    }
    
}
