public class Main{
  public static void main(String[] args) {
    // int[] rollno = new int[5];
    // String[] name = new String[5];
    // float[] marks = new float[5];
    // Student [] students = new Student[5];
    // Student kunal ;
    // System.out.println(kunal.rollno);
    // new :- Dynamic memory allocation 
    Student student1 = new Student(25,"Prruthwiraj mahapatra",85.4f);
    // student1.changename("Rakesh Yadav ");
    // student1.greeting();
    // student1.rollno =12; 
    // student1.Name = "Amar";
    // student1.marks =56.7f ;
    // student1.dispplay();
    System.out.println(student1.rollno);
    System.out.println(student1.Name);
    System.out.println(student1.marks);
    Student  random = new Student(student1 );
    System.out.println(random.Name );
    // System.out.println(student1.rollno);
    // constructor is a special type of functoiobn when you creat an object and it allocte same variable 

  }
}
class Student{
  int rollno;
  String Name;
  float marks; 
  // void dispplay(){
  //   System.out.println("Name "+Name+"\t Roll no "+rollno+"\tMarks "+marks);
  // }
  // void greeting(){
  //   System.out.println("Hello my name is "+this.Name);
  // }
  // void changename(String newName){
  //   Name = newName; 
  // }
  Student(Student other){
    this.Name=other.Name;
    this.rollno=other.rollno;
    this.marks=other.marks;
  }
  Student(){
    this.rollno =13;
    this.Name="Amar MAhapatra";
    this.marks=88.5f;
  }

  Student(int rno ,String name,float marks ){
    this.rollno =rno;
    this.Name = name;
    this.marks = marks;
    
  }

}