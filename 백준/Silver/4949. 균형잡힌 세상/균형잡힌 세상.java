import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(str.charAt(0) != '.'){
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '[' || str.charAt(i) == '(' ){
                    stack.add(str.charAt(i));
                } else if (str.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '['){ stack.pop(); }
                    else{
                        System.out.println("no");
                        break;
                    }
                } else if (str.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '('){ stack.pop(); }
                    else{
                        System.out.println("no");
                        break;
                    }
                } else if (str.charAt(i) == '.') {
                    if (stack.isEmpty()){
                        System.out.println("yes");
                    }else{
                        System.out.println("no");
                    }
                }
            }
            str = br.readLine();
        }

    }
}
