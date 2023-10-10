import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sumArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            sumArr[i] = sum;
        }

        int min = 0;
        int left = 0;
        for (int right =0; right < sumArr.length; right++ ){
            if (sumArr[right] >= s){
                while (sumArr[right] - sumArr[left] >= s){
                    left++;
                }
                min = min == 0 ? (right+1)-left : Math.min(min, (right+1)-left);
            }
        }
        System.out.println(min);
    }
}