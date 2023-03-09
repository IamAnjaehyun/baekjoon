import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            // System.out.println(st);
            if (st.isEmpty()) st.push(s.charAt(i));
            else{
                if (st.peek() == s.charAt(i)) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }

//        System.out.println(st);

        return st.empty() ? 1 : 0;
    }
}