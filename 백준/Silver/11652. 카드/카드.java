import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        Map<Long, Long> map = new HashMap<>();
        long max = -1;
        for(long i = 0; i < N; i++){
            long n = Long.parseLong(br.readLine());
            map.put(n, map.getOrDefault(n, (long)0)+1);
            max = max < map.get(n) ? map.get(n) : max;
        }
        long[] arr = new long[map.size()];
        int idx = 0;
        List<Long> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (Long key : keyList){
            if(map.get(key) == max){
                arr[idx] = key;
                idx++;
            }
        }
        System.out.println(arr[0]);
    }
}
