import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int ans = 0;
        for (int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            ans += arr[i];
        }
        Arrays.sort(arr);
        
        int gap = ans - 100;
        boolean stop = false;
        for (int i = 0; i < 8; i ++){
            for (int j = i+1; j < 9; j++){
                if(arr[i]+arr[j] == gap){
                    arr[i] = 0;
                    arr[j] = 0;
                    stop = true;
                    break;
                }
            }
            if (stop) break;
        }
        Arrays.sort(arr);
        for (int i = 2;  i < 9; i++){
            System.out.println(arr[i]);
        }

    }
}
