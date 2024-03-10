import java.io.*;
import java.util.*;

public class Main {
    static int mod(int a, int m){
        int x = a%m;
        if (x < 0) return x+m;
        return x;
    }
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
            List<Integer> list = new ArrayList<>();

            for (int j = i; j < n-1-i; j++){
                list.add(arr[j][i]);
            }
            for (int j = i; j < m-1-i; j++){
                list.add(arr[n-1-i][j]);
            }
            for (int j = n-1-i; j > i; j--){
                list.add(arr[j][m-1-i]);
            }
            for (int j = m-1-i; j > i; j--){
                list.add(arr[i][j]);
            }
            
            int leng = list.size();
            int idx = -r;
            
            for (int j = i; j < n-1-i; j++){
                arr[j][i] = list.get(mod(idx++, leng));
            }
            for (int j = i; j < m-1-i; j++){
                arr[n-1-i][j] = list.get(mod(idx++, leng));
            }
            for (int j = n-1-i; j > i; j--){
                arr[j][m-1-i] = list.get(mod(idx++, leng));
            }
            for (int j = m-1-i; j > i; j--){
                arr[i][j] = list.get(mod(idx++, leng));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
