import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while( start < end ){
            if(arr[start] + arr[end] == m){
                count++;
                start++;
                end--;
            }else if(arr[start] + arr[end] > m){
                end--;
            }else{
                start++;
            }
        }
        System.out.println(count);
    }
}