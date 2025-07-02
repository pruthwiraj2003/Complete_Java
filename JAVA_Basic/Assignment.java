public class Assignment {
    public static void main(String[] args) {
        int n = 13839;
        int rem;
        int count=0;
        while(n>0){
            rem=n%10;
            if(rem == 3){
            count++;    
            }
            n=n/10;
        }
        System.out.println(count);
    }
    
}
