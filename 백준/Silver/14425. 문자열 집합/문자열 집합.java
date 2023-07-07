import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int str = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < str; i++){
            set.add(br.readLine());
        }
        for (int i = 0; i < n; i++){
            if (set.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
