public class ProductOfDigits {
    public static void main(String[] args) {
        int n =103;
        System.out.println(POD(n));
    }
    static int POD(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*POD(n/10);
    }
    
}
