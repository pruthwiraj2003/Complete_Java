public class BoxPrice extends BoxWeight {
  double cost;

    public BoxPrice() {
      super();
      this.cost =-1;
    }
  BoxPrice(BoxPrice old){
    super(other);
    this.cost = other.cost;
  }
  
  BoxPrice(double l, double h, double w,double weight,double cost){
    super(l,h,w,weight);
    this.cost = cost;
  }


  
}
