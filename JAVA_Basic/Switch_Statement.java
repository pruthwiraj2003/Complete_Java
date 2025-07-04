import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit=sc.next();
        //   switch(fruit){
        //     case "Mango":
        //         System.out.println("King of fruit");
        //             break;
        //     case "Apple":
        //         System.out.println("A sweet Red fruit");
        //            break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case " Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //     System.out.println("please enter a valid fruit");


        //   }
        System.out.println("Enter a Day No.:");
        int day =sc.nextInt();
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednseday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sundsay");
        }
          
    }
    
}
