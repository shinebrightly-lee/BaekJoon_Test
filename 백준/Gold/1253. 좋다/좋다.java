import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        if (n > 1) {
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int count = 0;
            for(int i = 0; i < arr.length; i++){
                int start = 0;
                int end = arr.length-1;
                while( start < end ){
                    if(start == i) {
                        start++;
                        continue;
                    }
                    if (end == i){
                        end--;
                        continue;
                    }
                    if(arr[start] + arr[end] == arr[i]){
                        count++;
                        break;
                    }else if(arr[start] + arr[end] > arr[i]){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
            System.out.println(count);
        }else{
            System.out.println(0);
        }
    }
}
