import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
        int n = Integer.parseInt(st.nextToken());
        int loop = Integer.parseInt(st.nextToken()); // 반복 수
        st = new StringTokenizer(br.readLine(), " ", false);
        int[] arr = new int[n];
        int[] sumArr = new int[n];
        int idx = 0;

        while (st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            sumArr[idx] = idx == 0 ? arr[idx] : sumArr[idx-1] + arr[idx];
            idx++;
        }

        for (int i = 0; i < loop; i++){
             int answer = 0;
             st = new StringTokenizer(br.readLine(), " ", false);
             int s = Integer.parseInt(st.nextToken())-1;
             int e = Integer.parseInt(st.nextToken())-1;
             answer = s-1 < 0 ? sumArr[e] : sumArr[e] - sumArr[s-1];
             System.out.println(answer);
            answer = 0;
        }

    }
}
