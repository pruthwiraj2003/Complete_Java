// Create a class Employee with fields name, salary, and department. Use a method to increase salary by a percentage.
public class Emplyee {
  String name;
  double salary;
  String department;

    public Emplyee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    void SalaryINcerement(double percentage){
      salary = salary+(salary*(percentage/100));
      System.out.println("Incerement Salary\t"+salary);
      
    }
    void Display(){
      System.out.println("Name of the emplyee\t "+name);
      System.out.println("Salary of the Emplyee\t"+salary);
      System.out.println("Department of the Emplyee\t"+department);
    }
    public static void main(String[] args) {
      Emplyee emp = new Emplyee("Sanny", 50000, "IT");
      Emplyee emp2 = new Emplyee("Sudeep", 60000, "HR");
      emp.Display();
        System.out.println("_____________________________");
      emp2.Display();
      System.out.println("_____________________________");
      System.out.println("After incerement");
      emp.SalaryINcerement(10);
        System.out.println("_____________________________");
      emp2.SalaryINcerement(15);
        System.out.println("_____________________________");
      emp.Display();
        System.out.println("_____________________________");
      emp2.Display();

    }
  
}
