import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        if (n < 10){ // 1 ~ 9
            ans += n;
        } else if (n < 100) { // 10 ~ 99
            n-= 9;
            ans = (n*2)+9;
        } else if (n < 1_000) { // 100 ~ 999
            n-= 99;
            ans = (n*3)+(90*2)+9;
        } else if (n < 10_000) { // 1_000 ~ 9_999
            n-= 999;
            ans = (n*4)+(900*3)+(90*2)+9;
        } else if (n < 100_000) {
            n-= 9_999;
            ans = (n*5)+(9_000*4)+(900*3)+(90*2)+9;
        } else if (n < 1_000_000) {
            n-= 99_999;
            ans = (n*6)+(90_000*5)+(9_000*4)+(900*3)+(90*2)+9;
        } else if (n < 10_000_000) {
            n-= 999_999;
            ans = (n*7)+(900_000*6)+(90_000*5)+(9_000*4)+(900*3)+(90*2)+9;
        } else if (n < 100_000_000) {
            n-= 9_999_999;
            ans = (n*8)+(9_000_000*7)+(900_000*6)+(90_000*5)+(9_000*4)+(900*3)+(90*2)+9;
        }else if (n == 100_000_000) {
            n-= 99_999_999;
            ans = (n*9)+(90_000_000*8)+(9_000_000*7)+(900_000*6)+(90_000*5)+(9_000*4)+(900*3)+(90*2)+9;
        }
        System.out.println(ans);
    }
}
