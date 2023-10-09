import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sumArr = new int[n];
        int sum = 0;
        int check = 0;
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            sumArr[i] = sum;
            if (sumArr[i] == m){
                check++;
                continue;
            } else if (sumArr[i] > m) {
                for (int j = 0; j < i; j++){
                    if (sumArr[i] - sumArr[j] == m ) {
                        check++;
                        break;
                    }
                }
            }
        }
        System.out.println(check);
    }
}