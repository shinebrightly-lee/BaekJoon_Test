import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = new int[19][19];
    static boolean check(int d, int i, int j) {
        boolean ans = false;
        if (d == 0) return false;
        for (int n = 0; n <= 5; n++) {
            if (j > 14) break;
            if (n == 5) {
                if( j+5 < 19){
                    ans = arr[i][j + 5] == d ? false : true;
                }else{
                    ans = true;
                }
            }
            if (j +n >= 19 || arr[i][j + n] != d) break;
        }
        if ((j-1 >= 0) && arr[i][j-1] == d) ans = false;
        if (ans) return true;

        for (int n = 0; n <= 5; n++) {
            if (i > 14) break;
            if (n == 5) {
                if( i+5 < 19){
                    ans = arr[i+5][j] == d ? false : true;
                }else{
                    ans = true;
                }
            }
            if (i+n >= 19 || arr[i+n][j] != d) break;
        }
        if ((i-1 >= 0) && arr[i-1][j] == d) ans = false;
        if (ans) return true;

        for (int n = 0; n <= 5; n++) {
            if (n == 5) {
                if( i+5 < 19 && j+5 < 19){
                    ans = arr[i+5][j+5] == d ? false : true;
                }else{
                    ans = true;
                }
            }
            if ( i+n >= 19 || j+n >= 19 || arr[i+n][j+n] != d) break;
        }
        if ( ( i-1 >= 0 && j-1 >= 0 ) && arr[i-1][j-1] == d ) ans = false;
        if (ans) return true;

        if (i < 4) return false;
        for (int n = 0; n <= 5; n++) {
            if (n == 5) {
                if( i-5 >= 0 && j+5 < 19){
                    ans = arr[i-5][j+5] == d ? false : true;
                }else{
                    ans = true;
                }
            }
            if ( i-n < 0 || j+n >= 19 || arr[i-n][j+n] != d) break;
        }
        if ( ( i+1 < 19 && j-1 >= 0 ) && arr[i+1][j-1] == d) ans = false;
        return ans;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if(check(arr[i][j], i, j)){
                    sb.append(arr[i][j]);
                    sb.append("\n");
                    sb.append(i+1);
                    sb.append(" ");
                    sb.append(j+1);
                }
            }
        }
        if (sb.length() > 0){
            System.out.println(sb);
        }else{
            System.out.println("0");
        }
    }
}
