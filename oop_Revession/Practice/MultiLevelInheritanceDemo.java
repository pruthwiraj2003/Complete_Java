// Write a Java program to demonstrate single inheritance using classes Person and Student.
// The Student class should inherit the properties of the Person class.
 class Person {
  String name;
  int age;
  String department;

    public Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
  void Display(){
    System.out.println("Name \t"+name);
    System.out.println("AGE \t"+age);
    System.out.println("department \t"+department);
  }
  
}
class Student extends  Person{
  String Branch;
  int rollno;

    public Student(String Branch, int rollno, String name, int age, String department) {
        super(name, age, department);
        this.Branch = Branch;
        this.rollno = rollno;
    }
  void displayStudent(){
    Display();  
    System.out.println("Branch \t"+Branch);
    System.out.println("Roll no \t"+rollno);
  }

}
public class MultiLevelInheritanceDemo {
  public static void main(String[] args) {
    Student s = new Student("MCA", 12, "Rakesh", 12, "Electrical");
    s.displayStudent();
  }
}

