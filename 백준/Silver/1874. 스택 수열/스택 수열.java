import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(br.readLine());
            arr[i] = i + 1;
        }
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
       int originIdx = 0;
       int arrIdx = 0;

       while(arrIdx < n && originIdx < n){
            stack.add(arr[arrIdx]);
            sb.append("+");
            sb.append("\n");
            while (origin[originIdx] == stack.peek()){
                sb.append("-");
                sb.append("\n");
                stack.pop();
                originIdx++;
                if (stack.isEmpty()) break;
            }
            arrIdx++;
       }
        if( !stack.isEmpty() ) {
            sb.setLength(0);
            sb.append("NO");
        }
        System.out.println(sb);
    }
}
