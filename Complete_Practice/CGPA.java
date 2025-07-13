// Calculate CGPA Java Program
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Math_grade_point = sc.nextDouble();
        Double English_grade_point = sc.nextDouble();
        Double Physic_grade_point = sc.nextDouble();
        double Math_credit = sc.nextDouble();
        double Physics_credit = sc.nextDouble();
        double English_credit = sc.nextDouble();
        Double GPA =  (Math_credit*Math_grade_point+English_credit*English_grade_point+Physics_credit*Physic_grade_point) / (Math_credit+English_credit+Physics_credit);
        System.out.println(GPA);

    }
    
}
