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

        int num = k;
        int answer = 0;
        while (queue.size() > 1) {
            if (queue.size() <= k){
                answer = queue.poll();
                break;
            }else{
                    while (num != 0){
                        if (num == k){
                            queue.add(queue.poll());
                            num--;
                            continue;
                        }
                        queue.remove();
                        num--;
                    }
                    num = k;
                
            }
        }

        System.out.println(answer);
    }
}
