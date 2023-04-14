import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.empty()){
                if( ')' == s.charAt(i) ){ return false; }
                stack.push(s.charAt(i));
                continue;
            }
            if('(' == s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        answer = stack.empty();
        return answer;
    }
}