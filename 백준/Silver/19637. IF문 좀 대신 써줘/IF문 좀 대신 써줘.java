import java.io.*;
import java.util.*;

public class Main {
    static int bs(int[] arr, int x){
        int left = 0, right = arr.length-1;
        int rt = 0;
        while (left <= right){
            int mid = (left+right)/2;
            if (arr[mid] >= x) {
                rt = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return rt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] character =  new String[n];
        int[] combat_capability = new int[n];
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            character[i] = st.nextToken();
            combat_capability[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(br.readLine());
            answer.append(character[bs(combat_capability, x)]);
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
