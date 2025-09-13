public class Main {
  public static void main(String[] args) {
    // Human Amar = new Human(22,"AMAR",70000,false);
    // Human Chandu = new Human(22, "CHANDU",100000,true);
    // Human Arpit = new Human(22, "CHANDU",100000,true);
    // System.out.println(Human.pop);
    // System.out.println(Human.pop);
    // System.out.println(Human.pop);
    // greeting();
  }
  // this is not dependant an object 
    static void fun(){
      Main obj = new Main();
      // greetin();                                  // you cantuse this because it requires an instance 
      //but the function you are using it in dose not depend on instance  
      obj.greeting();   
    }
  void greeting(){
    // fun();
    System.out.println("Hello world ");
  }
}
