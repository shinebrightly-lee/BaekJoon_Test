import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] ans = new int[4];
        double avg = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                max = Math.max(max, map.get(arr[i]));
                avg += arr[i];
        }
        List<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()){
            if (map.get(i) >= max){
                list.add(i);
            }
        }
        Collections.sort(list);
        Arrays.sort(arr);
        ans[0] = (int)Math.round(avg/n);
        ans[1] = arr[n/2];
        ans[2] = list.size() >= 2 ? list.get(1) : list.get(0);
        ans[3] = arr[n-1]-arr[0];
        for (int i = 0; i < 4; i++) {
            System.out.println(ans[i]);
        }
    }
}
