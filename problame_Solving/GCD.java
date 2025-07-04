
// Input: array = [12, 24, 36]
// Output: 12
// Explanation: The GCD of 12, 24, and 36 is 12.


public class GCD {
    public static void main(String[] args) {
        int arr[]={4,6,8,2,10};
        int GCD=FindGcd(arr);
        System.out.println(GCD);
        
    }   
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int FindGcd(int arr[]){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=gcd(result, arr[i]);
        }
        return result;
    }
}
