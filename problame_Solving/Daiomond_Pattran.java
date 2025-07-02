// Generating a Diamond Pattern of Stars
// Difficulty: Medium
// Topics: Patterns, Basic Programming
// Description: Write a program to create a diamond pattern with stars of a given size.
// Example:
// Input: size = 5
// Output:
//   *  
//  ***  
// *****  
//  ***  
//   *  


public class Daiomond_Pattran {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=2*i+1; j<=5;j++){
                System.out.print("*"+" ");

            }
        }
        System.out.println();
        
    }
    
}
