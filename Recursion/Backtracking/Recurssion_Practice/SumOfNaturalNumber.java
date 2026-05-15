// Print the sum of natural number from 1 to N 

public class SumOfNaturalNumber {
  public static void main(String[] args) {
    System.out.println(sum(5));
      
  }

  static int sum(int n){
    if(n ==1){
      return 1;
    }
    if(n ==0){
      return 0;
    }

    return n+sum(n-1);
  }
}
