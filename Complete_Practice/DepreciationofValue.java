// Calculate Depreciation of Value
// Cost of Asset = Initial purchase price
// Salvage Value = Estimated value after useful life
// Useful Life = Expected usage duration in years


import java.util.Scanner;
public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost_of_Asset :");
        double Cost_of_Asset = sc.nextDouble();
        System.out.println("Enter Salvage_Value :");
        double Salvage_Value=sc.nextInt();
        System.out.println("Enter useful_life_year :");
        double Useful_life = sc.nextDouble();

         Double Deprecition = (Cost_of_Asset - Salvage_Value) / Useful_life ;

        System.out.println(Deprecition);

    }
    
}
