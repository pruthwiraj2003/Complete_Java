public class ComplexNumber {
  int x;
  int y ;

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }
  void print(){
    if(y>=0)  System.out.println(x+" + "+y+"i");
    else  System.out.println(x+" - "+(-y)+"i");
  }
  void add(ComplexNumber z){
    this.x+=z.x;
    this.y+=z.y;
  }
  void multiply(ComplexNumber z1){
    x = x*z1.x - y*z1.y;
    y = x*z1.y + y*z1.x;
  }
  void Divide(ComplexNumber z){
    int a = this.x;
    int b = this.y;
    int c = z.x;
    int d = z.y;
    int denominator = c * c + d * d;
    this.x = (a * c + b * d)/denominator;
    this.y = (b * c - a * d)/denominator;

  }
  public static void main(String[] args) {
    ComplexNumber z1 = new ComplexNumber(2, -5);
    ComplexNumber z2 = new ComplexNumber(3, 4);
    z1.print(); z2.print();
    z1.add(z2);
    z1.print();
     //z2.print();
     z2.multiply(z1);
     z2.print();
     z2.Divide(z2);
     z2.print();

  }
}
