import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57){
                list.add(Integer.parseInt(my_string.substring(i,i+1)));
            }
        }
        int[] answer = list.stream()
                        .mapToInt(i -> i)
                        .toArray();
        Arrays.sort(answer);
        return answer;
    }
}