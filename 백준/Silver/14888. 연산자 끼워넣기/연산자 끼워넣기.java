import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] nums;
    static int max = (int) -1e9;
    static int min = (int) 1e9;

    static public void fx(int idx, int sum, int plu, int mnu, int mul, int div){
        if (idx == n){
            max = Math.max(sum, max);
            min = Math.min(sum, min);
        }
        if (plu > 0){
            fx(idx+1, sum + nums[idx], plu-1, mnu, mul, div);
        }
        if (mnu > 0){
            fx(idx+1, sum-nums[idx], plu, mnu-1, mul, div);
        }
        if (mul > 0){
            fx(idx+1, sum*nums[idx], plu, mnu, mul-1, div);
        }
        if (div > 0){
            fx(idx+1, sum/nums[idx], plu, mnu, mul, div-1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] oprt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        fx(1, nums[0], oprt[0], oprt[1], oprt[2], oprt[3]);

        System.out.println(max);
        System.out.println(min);
    }
}
