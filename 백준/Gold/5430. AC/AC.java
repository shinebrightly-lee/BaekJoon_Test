import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    static ArrayDeque<Integer> dq;
    static  Integer D(boolean r){
        if (r){
            return dq.removeLast();
        }else{
            return dq.removeFirst();
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer. parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++){
            String p = br.readLine();
            int n = Integer. parseInt(br.readLine());
            String str = br.readLine();
            boolean r = false;
            boolean done = false;

            if (n != 0){
                dq = Arrays.stream(str.substring(1,str.length()-1).split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(ArrayDeque::new));
            }else{
                dq = new ArrayDeque<>();
            }
            for (int i = 0; i < p.length(); i++){
                if (p.charAt(i) == 'R'){
                    r = !r;
                }else{
                    if (dq.isEmpty()){
                        done = true;
                        break;
                    }
                    D(r);
                }
            }
            if (done){
                System.out.println("error");
            }else{
                StringBuilder sb = new StringBuilder();
                ArrayList<Integer> list = new ArrayList<>();
                while(!dq.isEmpty()){
                    list.add(D(r));
                }
                sb.append("[");
                String str2 = list.stream().map(String::valueOf).collect(Collectors.joining(","));
                sb.append(str2);
                sb.append("]");
                System.out.println(sb);
            }
        }

    }
}
