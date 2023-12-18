import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        Queue<Integer> que = new LinkedList<>();

        que.add(1);
        boolean[] visited = new boolean[n+1];
        visited[1] = true;

        int[] parent = new int[n+1];

        while (!que.isEmpty()){
            int now = que.poll();
            for(Integer next : list.get(now)){
                if (visited[next]) continue;
                que.offer(next);
                visited[next] = true;
                parent[next] = now;
            }
        }
        for (int i = 2; i <= n; i++){
            System.out.println(parent[i]);
        }
    }
}
