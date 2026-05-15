public class MethodOverloading {
  public static void main(String[] args) {
    Greet obj = new Greet();
    // obj.greetings();
    // obj.greetings("Amar");
    obj.greetings("TANIA",7);

    
  }
}

class Greet{

  void greetings(){
    System.out.println("Hello good morinng");
  }
  void greetings(String name){
    System.out.println("Hello " + name+", Good morning");
  }
  void greetings(String name , int count){
    for(int i=0;i<count;i++){
      System.out.println("I LOVE YOU "+name);
    }
  }


  
}
