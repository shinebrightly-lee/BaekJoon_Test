import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        for (int i = 1; i < n; i++){
            int sum = i;
            for(int j = i+1; j < n; j++){
                sum += j;
                if(sum >= n) break;
            }
            count += sum == n ? 1 : 0;
        }
        System.out.println(count);
    }
}