public class Car implements Engine ,Break,Media {
  int a = 30;
  
  @Override
  public void brake() {
    System.out.println("I break like a normal Cart");
  }

    @Override
    public void start() {
        System.out.println("I start like a normal Cart");
        
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal Cart");
        
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Cart");
         
    }
    
    
  

  
}
