// Celling=smallesgt element in an array grater ot =target
// Find the floor of the number 
// AFlor=smaller is grater the target number  
public class Celling{
    public static void main(String[] args) {
        int arr []={2,3,5,9,14,16,18};
        int target=15;
        int ans =celling(arr, target);
        System.out.println(ans);
        
    }
    // Smallest number grater than equalto  target
    static int celling(int arr[],int target){
        int start=0;
        int end = arr.length-1;
         

        while(start<=end){
        int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
                
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }

        return start ;
    }
}