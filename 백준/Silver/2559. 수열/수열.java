import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer. parseInt(st.nextToken());
        int k = Integer. parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = -1_000_000_000;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (i >= k){
                sum -= arr[i-k];
                max = Math.max(max, sum);
            }else{
                max = sum;
            }
        }
        System.out.println(max);
    }
}
