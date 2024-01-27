import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] leng = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] city = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long cur = 0, next = 0, ans = 0, accumulate = 0;
        boolean bool = true;
        for (int i = 0; i < leng.length; i++){
            cur = bool ? city[i] : cur;
            next = city[i+1];
            if (cur > next){
                ans += accumulate == 0 ? city[i]*leng[i] : cur*leng[i];
                accumulate = 0;
                bool = true;
            }else{
                accumulate += city[i]*leng[i];
                ans += city[i]*leng[i];
                bool = false;
            }
        }
        System.out.println(ans);
    }
}
