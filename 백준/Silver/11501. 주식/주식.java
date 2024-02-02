import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long[] mx = new long[n];
            long m = 0;
            for (int i = arr.length-1; i >= 0; i--){
                mx[i] =m = Math.max(arr[i],m);
            }
            long ans = 0;
            for (int i = 0; i < arr.length; i++){
                ans += mx[i]-arr[i];
            }
            System.out.println(ans);
        }

    }
}
