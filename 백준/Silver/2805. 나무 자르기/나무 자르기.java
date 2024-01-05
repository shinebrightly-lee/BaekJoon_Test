import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    static long exploration(long[] tree, long m){
        long left = 0;
        long mid = 0;
        long right = tree[tree.length-1];
        long ans = 0;
        while (left <= right){
            long branches = 0;
            mid = (left + right)/2;
            for (int i = 0; i < tree.length; i++){
                branches += tree[i] >= mid ? tree[i] - mid : 0;
            }
            if(branches == m){
                return mid;
            } else if (branches < m) {
                right = mid-1;
            } else if (branches > m) {
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        long[] tree = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Arrays.sort(tree);
        System.out.println(exploration(tree, m));
    }
}
