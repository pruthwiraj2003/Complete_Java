
import java.util.Arrays;



public class All_Dissappeared {
    public static void main(String[] args) {
        int [] nums ={4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        
        
    }
    static int sort(int [] arr){
        int ans ;
        int i =0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++ ;

            }
            

        }
        for(int index =0;index<arr.length;i++){
                if(arr[index]!=index+1){
                    ans.add(index+1);
                }
        }
        return ans;
        
    }
    static void swap(int [] arr, int first, int second ){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
