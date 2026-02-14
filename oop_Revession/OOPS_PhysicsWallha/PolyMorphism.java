public class PolyMorphism {
  public static class Dog{
    void speak(){
      System.out.println("Something somethoing");
    }
  }
  public static class Cat{
    void speak(){
      System.out.println("Meo meo");
    }
    
  }
  public static class Lion{
    void speak(){
      System.out.println("rrrrrr");
    }

  }
  public static class Pikachu{
    void speak(){
      System.out.println("Pika Pika");
    }


  }
  public static class Human{
    void speak(){
      System.out.println("Hello How are you");
    }

  }
  public static void main(String[] args) {
    Human h = new Human();
    Cat c = new Cat();
    Dog d = new Dog();
    h.speak();
    c.speak();
    d.speak();
    
  }
}
