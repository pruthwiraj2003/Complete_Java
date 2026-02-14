// Write a Java class Student that uses a constructor to initialize name and roll number, and print them.
class Student{
  long redgno;
  String Name;
  int Age;
  float marks;
  Student(long redgno,String Name,int Age,float marks){
    this.redgno=redgno;
    this.Name = Name;
    this.Age=Age;
    this.marks=marks;
  }
   void Display(){
    System.out.println("Name of the Student "+Name);
    System.out.println("Registration no :"+redgno);
    System.out.println("Age :"+Age);
    System.out.println("mark :"+marks);
  }
}

public class Problame1{
  public static void main(String[] args) {
    Student s1 = new Student(2401090063L,"Pruthwiraj Mahapatra",22,10);
    s1.Display();
  }
}