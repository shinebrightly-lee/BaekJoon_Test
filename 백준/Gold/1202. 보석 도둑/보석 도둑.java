import java.io.*;
import java.util.*;

public class Main {
    static class Jewelry{
         long weight;
        long price;
        Jewelry(long weight, long price){
            this.weight = weight;
            this.price = price;
        }
        public long getWeight() {
            return weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Jewelry> jwl = new ArrayList<>();
        List<Long> bag = new ArrayList<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            jwl.add(new Jewelry(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
        }
        jwl.sort(Comparator.comparing(Jewelry::getWeight));
        for (int i = 0; i < k; i++){
               bag.add(Long.parseLong(br.readLine()));
        }
        Collections.sort(bag);
        PriorityQueue<Long> Bag = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        long ans = 0;
        for (int i = 0; i < jwl.size() && idx < bag.size(); i++){
            while (bag.get(idx) >= jwl.get(i).weight && i < jwl.size()){
                Bag.add(jwl.get(i++).price);
                if (i >= jwl.size()-1){
                    i--;
                    break;
                }
            }
            if (bag.get(idx) < jwl.get(i).weight){
                i--;
            }
            ans += Bag.isEmpty() ? 0 : Bag.poll();
            idx++;
        }
        while (idx < bag.size()){
            ans += Bag.isEmpty() ? 0 : Bag.poll();
            idx++;
        }
        System.out.println(ans);
    }
}
