public class SortedMatrix {
    public static void main(String[] args) {
        
    }
    static int[] binarysearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart <=cEnd){
            int mid=cStart+(cEnd - cStart )/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
                
            }
        }
        return new int[]{-1,-1};
    }
    static int [] search(int [][]matrix, int target){
        int rows= matrix.length;
        int col= matrix[0].length;

        if(rows==1){
            return binarysearch(matrix, 0, 0, col-1, target);
        }
        int rStart=0;
        int rEnd=rows-1; 
        int cMid=col/2;
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int []{rStart+1,cMid};
        }
        if(target <=matrix[rStart][cMid-1]){
            return binarysearch(matrix, rows, rStart, rEnd, target);
              
        }
        if(target >=matrix[rStart][cMid-1]){
              
        }
        if(target <=matrix[rStart+1][cMid-1]){
              
        }
        else if(target <=matrix[rStart][cMid-1]){
              
        }
        return new int[]{-1,-1};
        
    }
    
}
