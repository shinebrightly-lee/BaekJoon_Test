import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deq = new ArrayDeque();
        for (int i = 1; i <= n; i++){
            deq.add(i);
        }

        int num = 0;
        int numCheck = 0;
        boolean direction = true;
        while (!deq.isEmpty()){
            int q = 0;
            if (num == (k-1)){
                q = direction ? deq.poll() : deq.pollLast();
                System.out.println(q);
                num = 0;
                numCheck++;
                if (numCheck == m){
                    direction = !direction;
                    numCheck = 0;
                }
                continue;
            }

            if (direction){
                deq.add(deq.poll());
            }else{
                deq.addFirst(deq.pollLast());
            }
            num++;
        }
    }
}
