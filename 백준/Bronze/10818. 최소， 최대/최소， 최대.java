import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] str = br.readLine().split(" ");
        int max = -1_000_000;
        int min = 1_000_000;
        for(int i = 0; i < str.length; i++){
            max = Math.max(Integer.parseInt(str[i]), max);
            min = Math.min(Integer.parseInt(str[i]), min);
        }
        System.out.println(min + " " +max);
    }
}
