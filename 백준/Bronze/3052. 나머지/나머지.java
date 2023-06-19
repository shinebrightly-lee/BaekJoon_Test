import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine())%42;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++ ){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++){
            cnt += arr[i] != -1 ? 1 : 0;
        }
        System.out.println(cnt);
    }
}