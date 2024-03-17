import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] g = new int[n];
        int[] s = new int[n];
        int gMax = -1;
        int sMax = -1;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            g[i] = (Integer.parseInt(st.nextToken()));
            s[i] = (Integer.parseInt(st.nextToken()));
            gMax = Math.max(g[i],gMax);
            sMax = Math.max(s[i],sMax);
        }

        boolean[][] arr = new boolean[100][100];
        int ans = 0;

        for (int i = 0; i < gMax+10; i++) {
            for (int j = 0; j < sMax+10; j++) {
                for (int k = 0; k < n; k++) {
                    if ( ( g[k]-1 <= i && g[k]+9 > i )
                        && ( s[k]-1 <= j && s[k]+9 > j ) ){
                        arr[i][j] = true;
                    }
                }
                ans += arr[i][j] ? 1 : 0;
            }
        }

        System.out.println(ans);
    }
}
