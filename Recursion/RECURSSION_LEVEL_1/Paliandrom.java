public class Paliandrom {
  static int sum =0;
  static int rev(int n){
    if(n==0){
      return sum;
    }
    int rem =n%10;
    sum = sum*10+rem;
    return rev(n/10);

  }
  static boolean palin(int n){
    sum=0;
    return n ==rev(n);
  }
  public static void main(String[] args) {
    int n = 122;
    if(palin(n)){
      System.out.println(n+ " is a palindrom");
    }else{
      System.out.println(n+ " is not a paliandrom");
    }
    
  }
}
  