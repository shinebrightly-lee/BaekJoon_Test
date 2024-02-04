import java.io.*;
import java.util.*;

public class Main {
    static class Meeting{
         int front;
         int back;

        Meeting(int front, int back){
            this.front = front;
            this.back = back;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Meeting> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list, Comparator.comparingInt((Meeting a) -> a.back ).thenComparing((Meeting a) -> a.front));
        int idx = 0, cnt = 0, cur = 0;
        while(idx < n){
            if (list.get(idx).front >= cur){
                cnt++;
                cur = list.get(idx).back;
            }
            idx++;
        }
        System.out.println(cnt);
    }
}
