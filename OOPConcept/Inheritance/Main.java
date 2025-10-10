 class Box{
  double l;
  double h;
  double w;
  // double weight;
  Box(){
    this.h=-1;
    this.l=-1;
    this.w=-1;
  }
  Box(double side){
    this.w=side;
    this.l=side;
    this.h = side;
  }
   Box(double l, double h, double w){
    this.l=l;
    this.h=h;
    this.w=w;

  }
  Box(Box old){
    this.h = old.h;
    this.l=old.l;
    this.w=old.w;
  }

  public void information(){
    System.out.println("Running the box");
  }

}
public class Main{
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Box box = new Box(4.6,7.9,9.0 );
    // // Box box2 = new Box(box1); 
    // System.out.println(box.l+"  " +box.w+ "  " +box.h);
    // BOx_Weight box3 = new BOx_Weight(); 
    // System.out.println(box3.h+" "+box3.weight); 
    // Box box5 = new BOx_Weight(1.0,2,3,4);
    // System.out.println(box5);
      BoxPrice box = new BoxPrice();


  }
} 