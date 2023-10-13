import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       int check = 0;

       List<Integer> list = new ArrayList<>();
       for (int i = 2; i <= n; i++){
           list.add(i);
       }

       for (int i = 2; i <= n; i++){
           int remove = i;
           while (remove <= n){
               if(list.contains(remove)){
                   list.set(list.indexOf(remove),0);
                   check = remove;
                   k--;
               }

               remove += i;
               if(k < 1) break;
           }
               if(k < 1) break;
       }
        System.out.println(check);
    }
}
