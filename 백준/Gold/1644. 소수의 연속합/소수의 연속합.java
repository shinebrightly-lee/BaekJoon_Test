import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       List<Integer> list = new ArrayList<>();

       boolean[] arr = new boolean[n+1];

       for (int i = 2; i <= n; i++){
           if(!arr[i]) {
               list.add(i);
               for (int j = i*2; j <= n; j+=i ){
                   arr[j] = true;
               }
           }
       }
       int right = 0;
       int sum = 0;
       int check = 0;
       for (int left = 0; left < list.size(); left++){
           while (right < list.size() && sum <n){
               sum += list.get(right++);
           }
           if (sum == n) check++;
           sum -= list.get(left);
       }
        System.out.println(check);
    }
}
