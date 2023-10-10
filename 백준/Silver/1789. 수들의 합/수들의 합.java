import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n =  Long.parseLong(br.readLine());
        long sum = 0;
        long ans = 0;
       for (long i = 1; sum <= n; i++){
           ans = i;
           sum +=(long) i;
       }
           System.out.println((long)ans-1);
    }
}
