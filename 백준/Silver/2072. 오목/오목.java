import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = new int[20][20];
    static int one, two;

    static int width(){
        int accumulate = 1;
        for (int cur = two-1; cur > two-5; cur--) { // 왼
            if ( cur < 1 || arr[one][two] !=  arr[one][cur]){ break; }
            accumulate++;
        }
        for (int cur = two+1; cur < two+5; cur++) { // 오
            if (cur > 19 || arr[one][two] != arr[one][cur]){ break; }
            accumulate++;
        }
        return accumulate;
    }
    static  int height(){
        int accumulate = 1;
        for (int cur = one-1; cur > one-5; cur--) { // 우ㅣ
            if ( cur < 1 || arr[one][two] !=  arr[cur][two]){ break; }
            accumulate++;
        }
        for (int cur = one+1; cur < one+5; cur++) { // 아래
            if (cur > 19 || arr[one][two] != arr[cur][two]){ break; }
            accumulate++;
        }
        return accumulate;
    }
    static  int rightDiagonal(){
        int accumulate = 1;
        int oneCur = one;
        int twoCur = two;
        for (int i = 1; i <= 5; i++) { // 대각선 위
            if (oneCur-i < 1 || twoCur+i > 19){ break; }
            if ( arr[one][two] !=  arr[oneCur-i][twoCur+i]){ break; }
            accumulate++;
        }
        for (int i = 1; i <= 5; i++) { // 대각선 위
            if (twoCur-i < 1 || oneCur+i > 19){ break; }
            if ( arr[one][two] !=  arr[oneCur+i][twoCur-i]){ break; }
            accumulate++;
        }
        return accumulate;
    }
    static  int leftDiagonal(){
        int accumulate = 1;
        int oneCur = one;
        int twoCur = two;
        for (int i = 1; i <= 5; i++) { // 대각선 위
            if (oneCur-i < 1 || twoCur-i < 1){ break; }
            if ( arr[one][two] !=  arr[oneCur-i][twoCur-i]){ break; }
            accumulate++;
        }
        for (int i = 1; i <= 5; i++) { // 대각선 위
            if (twoCur+i > 19 || oneCur+i > 19){ break; }
            if ( arr[one][two] !=  arr[oneCur+i][twoCur+i]){ break; }
            accumulate++;
        }
        return accumulate;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean d = true; // true : 홀, false : 짝
        int ans = -1;
        for (int i = n; i > 0; i--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            one = Integer.parseInt(st.nextToken());
            two = Integer.parseInt(st.nextToken());
            arr[one][two] = d ? 1 : 2;
            if (ans != -1){ continue; }
            if (width() == 5){ ans = (n-i)+1; continue; }
            if (height() == 5){ ans = (n-i)+1; continue; }
            if (rightDiagonal() == 5){ ans = (n-i)+1; continue; }
            if (leftDiagonal() == 5){ ans = (n-i)+1; continue; }
            d = !d;
        }
        System.out.println(ans);
    }
}
