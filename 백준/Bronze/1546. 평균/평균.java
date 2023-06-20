import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int max = 0;
        double avg = 0.0;
        
          for(String str : strArr){
            max = Math.max(max, Integer.parseInt(str));
            avg += Double.parseDouble(str);
        }
        avg /= n;

        System.out.println(avg/max*100);
        br.close();
    }
}