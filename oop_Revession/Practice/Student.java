// Write a program to create a class Student with fields name, rollNo, and marks. Display them using a method.
public class Student{
  String name;
  int rollNo;
  double mark;
  Student(String name, int rollNo, double mark){
    this.name = name;
    this.rollNo= rollNo;
    this.mark = mark;

  }
  void Display(){
    System.out.println("Name of the student "+name);
    System.out.println("Roll NO of the student "+rollNo);
    System.out.println("Marks of the student "+mark);
  }
  public static void main(String[] args) {
    Student student = new Student("Amar",34,78.9);
    Student student2 = new Student("Rakesh",11,99.0);
    student.Display();
    student2.Display();

  }

}