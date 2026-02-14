public class TryCatchFinally {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello World");
//        try{
//            System.out.println(a[8]);
//        }catch(Exception e){
//            System.out.println("Exception handled ");
//        }finally{
//            System.out.println("I will run alway by default");
//        }
//        System.out.println("bye");
        try{
            getNumberfromArray(a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch the exception");
        }


    }
    static int getNumberfromArray(int a[]) throws ArithmeticException {
        return a[8];
    }
}
