 class Students{
    String name;
    private int rno;
    double cgpa;
    protected  void print(){
    System.out.println(name+" "+cgpa+" "+rno+" ");
  }
  int getRno(){

    return rno;
   }
   void  setRno(int x){
    rno =x;

   }

  }
  

public class PrivateKeyWord {
  
  public static void main(String[] args) {
    Students s1 = new Students();
    s1.cgpa =9.8;
    s1.setRno(23);
    System.out.println(s1.getRno());
    
  }
}
