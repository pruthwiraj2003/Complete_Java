import java.util.Arrays;
import java.util.Scanner;

public class Problamr_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []str ={'p','r','u','t','t','w','i','r','a','j'};
        char key ='j';
        System.out.println(Arrays.toString(str));
        for(int i =0;i<str.length;i++){
            if(str[i]==key){
                key=str[i];
                System.out.println("Character found at index : "+i);
            }
            
        }
    }
    
}
