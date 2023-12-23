import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i= 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(n-1));
    }
}
