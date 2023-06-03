import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num == 1){ answer[0] = total; return answer; };
        int n = (total/2)+1 < (num/2)+1 ? (num/2)+1 : (total/2)+1;
        while(n > -(n*2)){
            int nn = n;
            int t = 0;
            for(int i = 0; i < num; i++){
                answer[i] = nn;
                t += nn;
                nn--;
            }
            if(t == total) break;
            n--;
        }
        Arrays.sort(answer);
        return answer;
    }
}