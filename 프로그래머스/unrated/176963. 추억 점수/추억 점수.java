import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int idx = 0;
        for(String pt[] : photo){
            for(String p : pt){
                for ( String key : map.keySet() ) {
                    answer[idx] += key.equals(p) ? map.get(key) : 0;
                }
            }
            idx++;
        }
        return answer;
    }
}