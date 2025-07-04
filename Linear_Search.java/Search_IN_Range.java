import java.util.Scanner;
public class Search_IN_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={18,12,-7,3,14,28};
        int target = sc.nextInt();
        System.out.println(linearserch(arr, target,1,4));

        
    }
    static int linearserch(int [ ] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for(int i = start;i<=end;i++){
            int element = arr[i];
            if(element==target){
                return i;

            }
        }
        return -1;
    }
    
}
