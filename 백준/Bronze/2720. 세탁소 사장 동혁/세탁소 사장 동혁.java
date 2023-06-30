import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 0;
        int[] arr = { 25, 10, 5, 1 };
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++){
            c = Integer.parseInt(br.readLine());
            for (int j = 0; j < arr.length; j++){
                if (j != 3){
                    sb.append(c/arr[j] + " ");
                }else{
                    sb.append(c/arr[j]);
                }
                c = c%arr[j];
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
