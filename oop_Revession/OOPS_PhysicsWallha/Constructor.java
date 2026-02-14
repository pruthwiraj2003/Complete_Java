public class Constructor {
  public static class Car{
    int seats;
    String name;
    double length;

        public Car() {

        }

        public Car(int seats, String name, double length) {
            this.seats = seats;
            this.name = name;
            this.length = length;
        }
        
    
  }
  public static void main(String[] args) {
    Car c = new Car();
  }
}
