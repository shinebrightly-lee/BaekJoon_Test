import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if (x == 0){
                System.out.println( pq.isEmpty() ? 0 : pq.poll());
            }else{
                pq.add(x);
            }
        }
    }
}