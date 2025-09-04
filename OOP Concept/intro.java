public class intro {
  public static void main(String[] args) {
    // Student [] students = new Student[5];

    // Student kunal;   // declear 
    // System.out.println(Arrays.toString(students));
    // kunal = new Student();
    Student kunal = new Student(13,"Amar mahapatra",85.4f);
    // Student rahul = new Student(); 
    
    // kunal.rno=13;
    // kunal.name = "Kunal kushwha";
    // kunal.marks =7.4f;

    // kunal.changename("Anita Das");
    // kunal.greeting();
    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);

    Student random = new Student(kunal);

    System.out.println(random.name);
    System.out.println(random.rno);
    System.out.println(random.marks);

  }
     
}
// creat a class 
//  for every single student 
class Student {
    int  rno ;
    String name ;
    float marks ;
    void greeting(){

      System.out.println("Hello my name is "+this.name);
    }
    void changename(String NewName){
      name = NewName;
    }
    Student (Student other){
      this. name = other.name ;
      this. rno = other.rno;
      this.marks = other.marks;

    }
    Student(){
      this.rno=13;
      this.name = "Amar mahapatra";
      this.marks = 7.4f; 
    }

    Student(int roll , String naam , float mark){
      rno=roll;
      name = naam;
      marks = mark; 
    }
}
