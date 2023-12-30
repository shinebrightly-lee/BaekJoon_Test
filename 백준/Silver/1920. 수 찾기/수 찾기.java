import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    static int exploration(int m, int[] nArr){
        int left = 0;
        int right = nArr.length-1;
        if (nArr[left] > m || nArr[right] < m) return 0;
        while (left <= right){
            int mid = (left+right)/2;
            if (nArr[mid] == m){
                return  1;
            } else if (nArr[mid] > m) {
                right = mid-1;
            } else if (nArr[mid] < m) {
                left = mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] mArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nArr);
        for(int m : mArr){
            System.out.println(exploration(m, nArr));
        }
    }
}
