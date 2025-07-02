// ZGiven a sorted array anda target and a target value,return the index of the target.if not found return -1

public class BasicBinarySearch {
    public static void main(String[] args) {
        int num[]={1,2,4,5,7,10,12};
        int target=4;
        int ans =BBS(num, target);
        System.out.println(ans);
    }
    static int BBS(int num[],int target){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(target<num[mid]){
                 end=mid-1;
            }
            else if(target>num[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
    
}
