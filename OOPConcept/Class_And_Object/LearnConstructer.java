public class LearnConstructer {
  public static void main(String[] args) {
    Complex num1 = new Complex(12,15);
    num1.print();

  }
}
class Complex{
    int a, b;
    public Complex(int real, int imaginary){
      a = real;
      b= imaginary;
    }
    void print(){
      System.out.println(a+"  + "+b+"i");
    }
}