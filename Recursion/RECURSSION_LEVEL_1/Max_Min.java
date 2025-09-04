// Given an array of intiger arr,the task is find to the maximum and minimum element of the array using recrussion

public class Max_Min {
    public static void main(String[] args) {
        int []arr={1,4,3,-5,-4,8,6};
        System.out.println(MaxMin(arr));
        
    }
    static  int MaxMin(int arr[]){
        if(arr.length==1) return arr[0];
        return -1;
    }
    
}
