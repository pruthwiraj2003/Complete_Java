// 2. Find the Missing Number
// Problem: Given an array of size n with numbers from 0 to n, find the missing number.

// Input: [4, 0, 3, 1]
// Output: 2

public class Missing_Number {
    public static void main(String[] args) {
        int []arr={4,0,3,1};
        int res=sort(arr);
        System.out.println(res);
        
    }
    static int sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr[correct] && arr[i]<arr.length){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index =0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int [ ] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
