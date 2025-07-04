// Given a sorted Array and a target value return thr first and last position of the target 

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int num[]={5,7,7,8,8,10};
        int target=8;
        System.out.println(FALP(num, target));

    }
    static int FALP(int num[],int target){
        int ans =-1;
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<num[mid]){
                end=mid-1;
            }
            else if(target>num[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return ans ; 
        
        
    }
    int search(int[]num,int target,boolean findStartIndex ){
        int ans=-1;
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<num[mid]){
                end=mid-1;
            }
            else if(target>num[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return ans;
        


    }
    
}
