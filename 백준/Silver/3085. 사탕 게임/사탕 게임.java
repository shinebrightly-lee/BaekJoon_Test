import java.io.*;
import java.util.*;

public class Main {
    static int 가로(char arr[][]){
        int length = 1;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++ ){
            length = 1;
            for (int j = 1; j < arr.length; j++){
                length = arr[i][j-1] == arr[i][j] ? length + 1 : 1;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    static int 세로(char arr[][]){
        int length = 1;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++ ){
            length = 1;
            for (int j = 1; j < arr.length; j++){
                length = arr[j-1][i] == arr[j][i] ? length + 1 : 1;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] nn = new char[n][n];

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            for (int j = 0; j < n; j++){
                nn[i][j] = str.charAt(j);
            }
        }

        int max = 0;
        for (int i = 0; i < nn.length; i++ ){
            for (int j = 1; j < nn.length; j++){
                if (nn[i][j-1] == nn[i][j]) continue;
                char swap = nn[i][j-1];
                nn[i][j-1] = nn[i][j];
                nn[i][j] = swap;
                max = Math.max(max, Math.max(가로(nn), 세로(nn)));
                swap = nn[i][j-1];
                nn[i][j-1] = nn[i][j];
                nn[i][j] = swap;
            }
        }
        for (int i = 0; i < nn.length; i++ ){
            for (int j = 1; j < nn.length; j++){
                if (nn[j-1][i] == nn[j][i]) continue;
                char swap = nn[j-1][i];
                nn[j-1][i] = nn[j][i];
                nn[j][i] = swap;
                max = Math.max(max, Math.max(가로(nn), 세로(nn)));
                swap = nn[j-1][i];
                nn[j-1][i] = nn[j][i];
                nn[j][i] = swap;
            }
        }
            System.out.println(max);
    }
}
