import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 1; j < arr[i].length; j++){
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i ++){
            for (int j = 1; j < arr[i].length; j++){
                arr[j][i] =  arr[j][i] + arr[j-1][i];
            }
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;
            if (x1-1 < 0 && y1-1 < 0){
                System.out.println(arr[x2][y2]);
                continue;
            }else if (x1-1 < 0){
                System.out.println(arr[x2][y2] - arr[x2][y1-1] );
                continue;
            }else if (y1-1 < 0){
                System.out.println(arr[x2][y2] - arr[x1-1][y2]);
                continue;
            }
            System.out.println(arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1]);
        }

    }
}
