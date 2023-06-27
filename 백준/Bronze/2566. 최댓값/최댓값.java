import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] intArr = new int[9][9];
        int n = 0;
        Map<Integer, String> map  = new HashMap<>();
        int max = 0;
        for (int i = 0; i < 9; i++){
            String[] strArr = br.readLine().split(" ");
            for (String str : strArr){
                intArr[i][n] = Integer.parseInt(str);
                map.put(intArr[i][n], (i+1) +" " +(n+1));
                n++;
            }
            n = 0;
        }
        for (Integer i : map.keySet()){
            max = Math.max(i,max);
        }
        System.out.println(max);
        System.out.println(map.get(max));
    }
}
