class  Fraction{
  int num;
  int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplyfy();
    }
    void print(){
      System.out.println(num+" / "+den);
    }

    void add(Fraction f){
      num = num * f.den + den * f.num;
      den *=f.den;
      simplyfy();

    }
    void multiply(Fraction f){
      num*=f.num;
      den*= f.den;
      simplyfy();
    }
    void simplyfy(){
      boolean isNegative = (num*den < 0) ?true : false;
      int gcd = hcf(num , den);
      num = num/gcd;
      den = den/gcd;
      if(isNegative) num = -num;
    }
    int hcf(int a , int b){
      if(a ==0) return b; 
      return hcf(b%a,a);
    }
  

}
public class FracctionClass {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(3, -7);
    f1.print();
    Fraction f2 = new Fraction(7, 3);
    f2.print();
    f1.multiply(f2);
    f1.print();
    f1.multiply(f2);
    f1.print();
    Fraction f3 = new Fraction(-50, -100);
    f3.print();


  }
  
}
