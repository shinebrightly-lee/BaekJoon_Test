import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        for(int i = 2; i < strArr.length; i++){
            if(strArr[i-1].charAt(0) == '+'){
                answer += Integer.parseInt(strArr[i]);
            }else if(strArr[i-1].charAt(0) == '-'){
                answer -= Integer.parseInt(strArr[i]);
            }
            i++;
        }
        return answer;
    }
}