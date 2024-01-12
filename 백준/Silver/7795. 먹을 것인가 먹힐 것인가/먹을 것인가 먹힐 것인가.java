import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer. parseInt(br.readLine());

        while(tc-- >0){
            br.readLine();
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(b);

            int cnt = 0;
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < b.length; j++){
                    if (a[i] > b[j]){
                        cnt++;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
