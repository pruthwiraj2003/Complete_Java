import java.util.Scanner;
public class MultiDimentionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*
         * 1 2 3 
         * 4 5 6
         * 7 8 9
         */ 
        //  int [][]arr = new int[3][];
        // int [][] arr={
        //     {1,2,3},
        //     {4,5},
        //     {4,5,7,8}
        // };
        // System.out.println(java.util.Arrays.toString(arr));
        // System.out.println(arr);
        int [][] arr = new int[3][4];
        System.out.println(arr.length);



        // INPUT
        for(int row=0;row<arr.length;row++){
            // for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();

            }
            
        }
        // OUTPUT
        for(int row=0;row<arr.length;row++){
            // for each col in every row
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
            
        }




    }
    
}
