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
            Arrays.sort(a);
            Arrays.sort(b);

            int cnt = 0;
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                    while (j < b.length) {
                        if (a[i] > b[j] ) {
                            j++;
                        } else {
                            break;
                        }
                    }
                    if (j >= b.length || b[j] >= a[i]){
                        cnt += j;
                    }
            }
            System.out.println(cnt);
        }
    }
}
