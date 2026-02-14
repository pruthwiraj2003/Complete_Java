

public class Main{
  public static void main(String[] args) {
    Student[] students = new Student[5];

    // Student kunal;
    // System.out.println(Arrays.toString(students));
    Student kunal = new Student();
    System.out.println(kunal.name);
    
  }
  
}
class Student{
    int rno;
    String name;
    float marks;

    public Student() {
        this.rno = 13;
        this.name = "Kunal ";
        this.marks =88.5f;
    }
    
}
  