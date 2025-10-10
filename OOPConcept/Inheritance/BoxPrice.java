public class BoxPrice extends BOx_Weight {
  double cost;

    public BoxPrice() {
      super();
        this.cost = -1;
    }

    public BoxPrice( BoxPrice other ) {
      super(other);
      this.cost = other.cost;
    }

    public BoxPrice(double cost, double weight, double l, double h, double w) {
        super(weight, l, h, w);
        this.cost = cost;
    }
    
    
  
  
}
