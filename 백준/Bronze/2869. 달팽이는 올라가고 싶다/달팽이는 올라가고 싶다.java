import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        int cnt = (v - b - 1) / (a - b) + 1;
        System.out.println(cnt);
    }
}
