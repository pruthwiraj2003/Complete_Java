
import java.util.Arrays;

//Generating a Matrix of fabonacci Numbers
// Write a programm to generate a matrix where each element is Fabonacci number 
// size =3

public class Fibonacci {
    public static void main(String[] args) {
        int [][] matrix=
        {
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };
        int a =0,b=1;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                matrix[i][j]=a;
                int next=a+b;
                a=b;
                b=next;                
            }
        }
        for(int[]row:matrix){
            System.out.println(Arrays.toString(row));
        }
        
        
    }
    
}
