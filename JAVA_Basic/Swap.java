public class Swap {
    public static void main(String[] args) {
        int  a=10;
        int b=20;
        Swap(a,b);
        System.out.println(a+"  " +b );

        String name="Amar mahapatra";
        changeName(name);
        System.out.println(name);

    }
    static void changeName(String name){
         name ="Adity Pradhan";
    }
    
    static void Swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
    
}
