import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        int num = 0;
        StringBuffer sb = new StringBuffer("<");
        while (!queue.isEmpty()){
            int q = 0;
            if (num == (k-1)){
                q = queue.poll();
                if (queue.isEmpty()){
                    sb.append(q+">");
                }else{
                    sb.append(q+", ");
                }
                num = 0;
                continue;
            }
            queue.add(queue.poll());
            num++;
        }
        System.out.println(sb);
    }
}
