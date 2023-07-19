import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            String str =  br.readLine();
            for(int j = 0; j < str.length(); j++){
                if (stack.isEmpty()){
                    if (str.charAt(j) == '('){
                        stack.push(str.charAt(j));
                        continue;
                    }
                        stack.push(str.charAt(j));
                    break;
                } else if (stack.peek() == str.charAt(j) &&
                                str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else if (stack.peek() == '(' &&
                        str.charAt(j) == ')'){
                        stack.pop();
                }
            }
            answer = stack.isEmpty() ? "YES" : "NO";
            System.out.println(answer);
            stack.clear();
        }
    }
}
