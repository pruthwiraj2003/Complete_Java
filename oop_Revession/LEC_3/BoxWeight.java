public class BoxWeight extends Box {
  double weight;

    public BoxWeight() {
      this.weight=-1;
    }
    BoxWeight(BoxWeight other){
      super(other);
      weight = other.weight;
    }

    public BoxWeight(double weight, double l, double h, double w) {
        super(l, h, w); // call the parent class construter  used to initialize values present in parent class 
        System.out.println(this.h);
        this.weight = weight;
    }
    
}

// Types of inheritance :
/*
 * Single inheritance : - one class extends another class
 * 2. Multi level inheritance : - one class can inherit from a derived class 
 * 
 * MultipleInheritance : -  one class extending more thean one class 
 * multiple inheritance is not support in java 
 * Hierardchical inheritance : - one clas is inheritad by many classes 
 * Hybrid inheritance : - it is the combination of single and multiple inheritance but java does not suppert this      
 */

//  Polymorphism : poly = many morphism = way to represent 
/*
 * Act of representing same thing in multiple way 
 */
