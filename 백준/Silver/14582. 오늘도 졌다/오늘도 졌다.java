import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 제미니스
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 스타트링크 걸리버스

        int j = 0;
        int s = 0;
        int check = 0;
        for (int i = 0; i < arr1.length; i++){
            j += arr1[i];
            if (check == 0 && j > s){
                check++;
            }
            s+= arr2[i];
            if (check ==1 && j < s){
                check++;
            }
        }
        String ans = check == 2 ? "Yes" : "No";
        System.out.println(ans);
    }
}
