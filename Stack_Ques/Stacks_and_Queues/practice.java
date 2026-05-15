public class practice {
    public static void main(String[] args) {

        EligibleVoters(16);

    }
    static void EligibleVoters(int age){
        if(age<18){
            throw new ArithmeticException("Not Eligible for Vote");
        }else {
            System.out.println("Eligible for Vote");
        }
    }
}
