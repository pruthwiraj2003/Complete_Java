import java.util.*;

public class RemoveConcativeDuplicate {
    public static void main(String[] args) {
        RemoveDuplicated("aabccadderr");
    }

    static void RemoveDuplicated(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        System.out.println(ans);
    }
}