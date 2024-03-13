import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int number = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[n][n];
        int num = 1;
        int t = 1;
        arr[n/2][n/2] = num;

        for (int i = (n/2)-1; i >= 0; i--){
            for (int j = i+1; j <= n/2+t; j++){
                arr[i][j] = ++num;
            }
            for (int j = i+1; j <= n/2+t ; j++){
                arr[j][n/2+t] = ++num;
            }
            for (int j = n/2+t-1; j >= i; j--){
                arr[n/2+t][j] = ++num;
            }
            for (int j = n/2+t-1; j >= i ; j--){
                arr[j][i] = ++num;
            }
            t++;
        }

        String ans = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                sb.append(arr[i][j]);
                sb.append(" ");
                if (number == arr[i][j]){
                    ans = ( i+1 ) + " " + ( j+1 );
                }
            }
                sb.append("\n");
        }
        sb.append(ans);
        System.out.println(sb);
    }
}
