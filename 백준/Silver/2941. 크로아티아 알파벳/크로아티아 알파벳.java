import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        boolean y_n = true;

        for (int i = 0; i < str.length(); i++){
            for(int j = 0; j < arr.length; j++){
                if(str.charAt(i) == arr[j].charAt(0)){
                    if(str.length() >= i+arr[j].length() && str.substring(i,i+arr[j].length()).equals(arr[j])){
                        cnt++;
                        i += arr[j].length()-1;
                        y_n = false;
                        break;
                    }
                }
            }
            cnt += y_n ? 1 : 0;
            y_n = true;
        }
        System.out.println(cnt);
        br.close();
    }
}
