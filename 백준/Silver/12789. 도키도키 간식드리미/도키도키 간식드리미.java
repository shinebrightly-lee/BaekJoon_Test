import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> waitingLine = new Stack<>();
        int in = 1;

        while(st.hasMoreTokens()){
            int cur = Integer.parseInt(st.nextToken());
            if (in == cur){
                in++;
            }else{
                while (!waitingLine.isEmpty() && in == waitingLine.peek()){
                    in++;
                    waitingLine.pop();
                    if (in == cur){ in++;  cur = 0;}
                }
                if (in != cur && cur != 0){waitingLine.push(cur);}
            }
        }

        boolean nice = true;
        while (!waitingLine.isEmpty()){
            if (in != waitingLine.pop()){
                nice = false;
                break;
            }
            nice = true;
            in++;
        }
        System.out.println(nice? "Nice" : "Sad");


    }
}
