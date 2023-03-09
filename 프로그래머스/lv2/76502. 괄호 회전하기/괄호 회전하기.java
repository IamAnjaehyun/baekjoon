import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            if(isAnswer(s)) answer++;
            s = s.substring(1)  + s.charAt(0);
            // System.out.println(s);
        }
        return answer;
    }

    public boolean isAnswer(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i) == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }else if(s.charAt(i) == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }else if(s.charAt(i) == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
    
}