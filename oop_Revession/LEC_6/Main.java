import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Student kunal = new Student(12,78.8f);
    Student Rahul = new Student(2,84.8f);
    Student Amar = new Student(12,41.8f);
    Student Anita = new Student(22,74.8f);
    Student Animisha = new Student(20,24.8f);
    Student[] list ={kunal,Rahul,Amar,Anita,Animisha};
    System.out.println(Arrays.toString(list));
    Arrays.sort(list);
    System.out.println(Arrays.toString(list));

    // if(kunal.compareTo(Rahul) < 0){
    //   System.out.println(kunal.compareTo(Rahul));
    //   System.out.println("rahul has more marks");
    // }
  }
}
