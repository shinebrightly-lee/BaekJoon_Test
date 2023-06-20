import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int cnt = 0;
        for (String str : strArr){
           cnt += "".equals(str) ? 0 : 1;
        }
        System.out.println(cnt);
        br.close();
        
    }
}