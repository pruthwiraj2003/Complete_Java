
import java.util.Arrays;


// Given a 2D matrix with rows sorted in ascending order (but no guarantees between rows), search for a target by performing binary search on each row.
// Input: matrix = [[10, 20, 30], [15, 25, 35], [27, 29, 37]], target = 29  
// Output: true


public class BS_Row {
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30},
            {15,25,35},
            {27,29,37}
        };
        int target=29;
        System.out.println(Arrays.toString(BSIR(matrix, target)));
            
    }
    static int[] BSIR(int matrix[][],int target){

        int r =0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int []{r,c};
            }
            else if (matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
    
}
