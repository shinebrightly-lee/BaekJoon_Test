import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + " " + arr[i][1] );
        }
    }
}
