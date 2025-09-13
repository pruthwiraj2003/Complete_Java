public class Human {
  int age ;
  String name;
  int Salary;
  boolean married;
  static long pop;
  static void message(){
    System.out.println("Hello world ");
  }
  public Human(int age , String name , int Salary , boolean married){
    this.age=age;     
    this.name = name;
    this.Salary = Salary;
    this.married=married;
    this.pop+=1;
    // Human.message();
  }
}
