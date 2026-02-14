class Cricketer{
  static  String country ="NEWZALAND";
  String name;
  int run;
  double avg;
}
public class FinalAndStatic {
  public static void main(String[] args) {
    Cricketer c1 = new Cricketer();
    // c1.country = "South Africa";
    // System.out.println(c1.country);
    Cricketer c2 = new Cricketer();
    c1.country="India";
    System.out.println(c2.country);
    
  }
}
