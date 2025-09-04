

public class Count_Swap{
    public static void main(String[] args) {
        int arr [] ={3,2,1};
        int n =Input_sort(arr);
        System.out.println(n);
    
        
    }
    static int Input_sort(int arr[]){
        int count =0;
        for(int i =0;i<arr.length;i++){
            for(int j =1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    count++;
                }
            }
        }
        return count;
    }
}