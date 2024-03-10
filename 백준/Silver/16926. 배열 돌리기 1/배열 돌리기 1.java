import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < Math.min(n,m)/2; i++){
            Deque<Integer> deq = new ArrayDeque<>();

            for (int j = i; j < n-1-i; j++){
                deq.add(arr[j][i]);
            }
            for (int j = i; j < m-1-i; j++){
                deq.add(arr[n-1-i][j]);
            }
            for (int j = n-1-i; j > i; j--){
                deq.add(arr[j][m-1-i]);
            }
            for (int j = m-1-i; j > i; j--){
                deq.add(arr[i][j]);
            }

            for (int j = 0; j < r; j++ ){
                deq.addFirst(deq.pollLast());
            }

            for (int j = i; j < n-1-i; j++){
                arr[j][i] = deq.pollFirst();
            }
            for (int j = i; j < m-1-i; j++){
                arr[n-1-i][j] = deq.pollFirst();
            }
            for (int j = n-1-i; j > i; j--){
                arr[j][m-1-i] = deq.pollFirst();
            }
            for (int j = m-1-i; j > i; j--){
                arr[i][j] = deq.pollFirst();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
