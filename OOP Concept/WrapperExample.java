public class WrapperExample {
  public static void main(String[] args) {
    // int a ;
    // int b ;
    Integer a=10;
    Integer b = 20;
    // Integer num = 45; 
    swap(a,b);
    System.out.println(a+ " "+b);
    final int bonous = 45;
  final A kunal = new A("AMAR "); 
  // kunal = new A("LUCKY");
  A obj = new A("SAgar");
    System.out.println(obj);

  }
   static void swap(Integer a, Integer b){
    Integer temp = a;
    a=b;
    b=temp;
  }
  
}
 class A {
  final int num =90;
  String name;
  public A(String name){
    this.name = name ;
  }

    
   
 }
// 1:38:26