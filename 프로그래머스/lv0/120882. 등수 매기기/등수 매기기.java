import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int idx = 0;        
        for(int[] sc : score){
            answer[idx] = sc[0] + sc[1];
            idx++;
        }
        
        int[] result = Arrays.copyOf(answer, answer.length);
        Arrays.sort(result);
        Map<Integer, Integer> map = new HashMap<>();
        idx = 1;
        for(int i = result.length-1; i >= 0; i--){
            if(map.containsKey(result[i])){
                idx++;
            }else {
                map.put(result[i], idx++);
            }
        }
        for(int j = 0; j < answer.length; j++){
           answer[j] = map.get(answer[j]);
        }
        return answer;
    }
}