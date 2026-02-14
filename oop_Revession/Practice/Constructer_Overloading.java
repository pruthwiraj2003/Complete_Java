// Write a program with two constructors: one default and one parameterized. Show how constructor overloading works.
public class Constructer_Overloading {
  String name;
  boolean married;
  int age;

    public Constructer_Overloading() {
      name ="Sagar dalai";
      married = false;
      age = 32;

    }

    public Constructer_Overloading(String name, boolean married, int age) {
        this.name = name;
        this.married = married;
        this.age = age;
    }
    void Display(){
      System.out.println("Name =" +name+ "\tmarried ="+married+"\tAge ="+age);
    }
    public static void main(String[] args) {
        Constructer_Overloading con = new Constructer_Overloading();
        Constructer_Overloading con1 = new Constructer_Overloading("Amar",true,23);
        con.Display();
        con1.Display();
        
        
    }
    
  

}
