public class Daughter extends Parent {
  

    public Daughter() {
        super(0);
    }
  @Override
  void career(String name){
    System.out.println("I am going to be docter"+name);
  }
  @Override
  void partner(String name, int age) {
    System.out.println("I love "+name+" he is "+age);
  }
  
}
// Multiple inheritance is not supported thats why you use inteface
/*
interfaces :- implements key word 
 */ 