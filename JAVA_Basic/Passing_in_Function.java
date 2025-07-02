public class Passing_in_Function {
    public static void main(String[] args) {
    int [] nums ={3 ,4, 5, 12};     
    System.out.println(java.util.Arrays.toString(nums));
    change(nums);
    System.out.println(java.util.Arrays.toString(nums));
    }
    static void change(int[] arr){

        arr[0]= 665;
    }
    
}
