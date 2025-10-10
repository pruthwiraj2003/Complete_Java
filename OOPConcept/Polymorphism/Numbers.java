public class Numbers {
  int sum (int a , int b ){
    return a+b;
  }

  int sum (int a , int b ,int c ){
    return a+b+c;
  }
  public static void main(String[] args) {
    Numbers num = new Numbers();
    num.sum(5,7);
    num.sum(1,3,7);
    // num.sum(1,2,3,54,5);  
  }
  
}
