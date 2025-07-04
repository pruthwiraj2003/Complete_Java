
import java.util.Arrays;

// Search in a Row-wise Sorted Matrix
// You are given an m x n matrix where each row is sorted in ascending order. Write a function to search for a target value in this matrix.
// Example:
// Input: matrix = [[1,4,7,11], [2,5,8,12], [3,6,9,16]], target = 5  
// Output: true

public class Row_Sorted {
    public static void main(String[] args) {
        int matrix [][]={
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16}
        };
        int target=6;
        System.out.println(Arrays.toString(RowSorted(matrix, target)));
        
    }
    static int[] RowSorted(int matrix[][],int target){
        int r =0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if(matrix[r][c]<target){
                 r++;
            }else{
                c--;
            }
        }
        
        return new int[] {-1,-1};
    }
    
}
