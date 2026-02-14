public class ObjectPrint {
  int num ;

    public ObjectPrint(int num) {
      this.num = num ;
    }
    void display(){
      System.out.println(num);
    }
  
  public static void main(String[] args) {
    ObjectPrint obj = new ObjectPrint(5);
  obj.display();
  }
}

/*
 * in Java every class extend object class by defult  
 */
