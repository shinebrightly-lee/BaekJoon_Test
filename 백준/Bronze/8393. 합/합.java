import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int j = 1; j <= n; j++) {
            result += j;
        }
        System.out.println(result);
    }
}
