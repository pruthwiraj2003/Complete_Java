class Person {
  String name;
  int age;
  String Department;

    public Person(String name, int age, String Department) {
        this.name = name;
        this.age = age;
        this.Department = Department;
    }
  void displayPerson(){
    System.out.println("\n--- Principal Details ---");
    System.out.println("Name =\t"+name);
    System.out.println("Age =\t"+age);
    System.out.println("Department =\t"+Department);
  }
  
}
class Student extends  Person{
  int rollNo;
  String Branch;

    public Student(int rollNo, String Branch, String name, int age, String Department) {
        super(name, age, Department);
        this.rollNo = rollNo;
        this.Branch = Branch;
    }
    void displayStudent() {
        System.out.println("\n--- Student Details ---");
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + Branch);
    }
  
}
class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String department, String subject, double salary) {
        super(name, age, department);
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacher() {
        System.out.println("\n--- Teacher Details ---");
        displayPerson();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
class Staff extends Person {
    String position;
    double hourlyWage;

    public Staff(String name, int age, String department, String position, double hourlyWage) {
        super(name, age, department);
        this.position = position;
        this.hourlyWage = hourlyWage;
    }

    void displayStaff() {
        System.out.println("\n--- Staff Details ---");
        displayPerson();
        System.out.println("Position: " + position);
        System.out.println("Hourly Wage: " + hourlyWage);
    }
}

class Principal extends Person {
    int yearsOfExperience;
    String qualification;

    public Principal(String name, int age, String department, int yearsOfExperience, String qualification) {
        super(name, age, department);
        this.yearsOfExperience = yearsOfExperience;
        this.qualification = qualification;
    }

    void displayPrincipal() {
        System.out.println("\n--- Principal Details ---");
        displayPerson();
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Qualification: " + qualification);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Person p2 = new Person("RAvi", 56, "Machine learning ");
        Student s1 = new Student(123,"MCA","Samaya",23,"Computer application");
        Teacher t1 = new Teacher("Dr. Meena", 40, "Computer Science", "Data Structures", 75000);
        Staff st1 = new Staff("Kiran", 35, "Maintenance", "Lab Assistant", 250);
        Principal p1 = new Principal("Dr. Sharma", 55, "Administration", 25, "PhD in Management");

        // Display all details
        s1.displayStudent();
        t1.displayTeacher();
        st1.displayStaff();
        p1.displayPrincipal();
        p2.displayPerson();
    }
}

