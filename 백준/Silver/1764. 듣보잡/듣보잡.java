import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
     
      Map<String, Integer> map = new HashMap<>();
    
      for(int i = 0; i < n+m; i++){
          String str = br.readLine();
          map.put(str, map.getOrDefault(str, 0)+1);
      }
      
      List<String> list = new ArrayList<>();
      
      for(String str : map.keySet()){
          if(map.get(str) > 1){
              list.add(str);
          }
      }
      System.out.println(list.size());
      Collections.sort(list);
        
      for(String str : list){
          System.out.println(str);
      }
        
    }
}