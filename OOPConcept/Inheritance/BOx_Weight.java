public class BOx_Weight extends Box {
   double weight;

    public BOx_Weight() {
      this.weight =-1;
    }
    public BOx_Weight(BOx_Weight other) {
    super(other);            // calls Box(Box old)
    this.weight = other.weight;
}


    public BOx_Weight(double weight, double l, double h, double w) {
        super(l, h, w);  // what is this thing - call the parent class constructor USed to initialise values paresent in parent class 
        // System.out.println(super.weight);
        
        this.weight = weight;
    }
       
}
// q:11:17

// types of inheritance :-
/*
 * Single inheritance  :- One class extend another class  
 * multilevel inheritance : -  one class can in heriti derived parent class
 * Hierarchial Inheritance :- Onee class is in herited by many class 
 * Hy brid Inheritance : - it is the ncombination of single and multiple inheritance 
 * 
 * Multiple in heritance are not allowed in java 
 */
