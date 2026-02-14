public class Main {
  public static void main(String[] args) {
      Son son = new Son(24);
      son.career("Doctor");

      Daughter daughter = new Daughter();
      daughter.career("Engineer");
      Parent.hello();
  }
}
// You can't creat an object of abstract class 
// Abstract constructer is not allowed 
