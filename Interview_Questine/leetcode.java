public class leetcode {
    
    // Function to compute the difference
    public static int difference(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }

    // Main method
    public static void main(String[] args) {
        int n = 10;  // You can change this value
        int m = 3;   // You can change this value

        int result = difference(n, m);
        System.out.println("Result: " + result);
    }
}

    

