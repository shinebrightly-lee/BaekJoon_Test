import java.io.*;
import java.util.*;
public class Main {
    static boolean check (int imp, Deque<Integer> que){
        if (imp/2 == que.peek()/2)return  true;
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i= 0; i < N; i++){
            Deque<Integer> que = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); 
            int q = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int count = 1;
            for (int j = 0; j < n; j++){
                que.add( j == q ?  Integer.parseInt(st.nextToken())*2+1 :  Integer.parseInt(st.nextToken())*2 );
                list.add(que.peekLast());
            }
            Collections.sort(list, Comparator.reverseOrder());
            while (true){
                if (check(list.get(0), que) && que.peek()%2 == 1){
                    System.out.println(count);
                    break;
                } else if (check(list.get(0), que)) {
                    list.remove(0);
                    que.removeFirst();
                    count++;
                }else {
                    que.addLast(que.peek());
                    que.remove();
                }
            }
        }

    }
}
