// Write a program to generate a matrix where each element at position (i, j) is the product of i and j.
// input=3
// ottput
// 1 2 3  
// 2 4 6  
// 3 6 9  

import java.util.Scanner;
public class MAtrix_With_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n =sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("//Orginal Matrix//");
        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
                
                
            }
        }
        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("//After multiplication//");
        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                arr[i][j]=i*j;
                System.out.print(arr[i][j]+" ");
                
            }

            System.out.println();
        }
        
        
        
    }
    
}
