// Mountain Array:-increasing and decreasing array
// Bitonic AArray ex:-arr={1,2,3,5,7,6,3,2}
// QA: find peak in mountain Array


public class Mountain_Array {
    public static void main(String[] args) {
        int arr[]={0,1,0};
        int ans =mountainPeak(arr);
        System.out.println(ans);
        
    }
    static int mountainPeak(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end= mid;

            }
            else{
                start=mid+1;
            }

        }
        return start;
 
    }
    
}
