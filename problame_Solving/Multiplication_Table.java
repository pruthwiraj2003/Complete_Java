// Generating a Multiplication Table for a Range
// 2 x 1 = 2   3 x 1 = 3   4 x 1 = 4  
// 2 x 2 = 4   3 x 2 = 6   4 x 2 = 8  
// 2 x 3 = 6   3 x 3 = 9   4 x 3 = 12  
// 2 x 4 = 8   3 x 4 = 12  4 x 4 = 16  

public class Multiplication_Table {
    public static void main(String[] args) {
        int start=2 , end=4;
        for(int i =start;i<=end;i++){
            for(int j=1;j<=end;j++){
                System.out.print(i+"X"+j+"="+i*j);
                System.out.println();
            }
        }

    }
    
}
