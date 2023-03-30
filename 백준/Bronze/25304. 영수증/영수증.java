import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] list = new int[n*2];
        int result = 0;
        for(int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }
        for (int i = 1; i < list.length; i++){
            result += list[i-1]*list[i];
            i++;
        }
        String Y_N = result == total ? "Yes" : "No";
        System.out.println(Y_N);
    }
}
