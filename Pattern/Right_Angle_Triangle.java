

public class Right_Angle_Triangle{
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        pattern5(5);
        
    }
    // static void pattern1(int n){
    //     for(int i =1;i<=n;i++){// row 
    //         for(int j =1;j<=i; j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();

    //     }
    // }
    // static void pattern2(int n){
    //     for(int i =1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }

    // }
    // static void pattern3(int n){
    //     for (int i = 1; i<=n; i++) {
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print("*"+" ");

    //         }
    //         System.out.println();
    //     }
    // }
    // static void pattern4(int n){
    //     for(int i =1;i<=n;i++){
    //         for(int j =1;j<=i;j++){
    //             System.out.print(j+" ");
                
    //         }
    //         System.out.println();
    //     }
    // }
    static void pattern5(int n){
        for(int i=1;i<=2*n-1;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}