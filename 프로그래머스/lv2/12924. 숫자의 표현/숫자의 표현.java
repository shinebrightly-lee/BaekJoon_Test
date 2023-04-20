class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i = 1; i <= n/2; i++){
            for(int j = i; j <= (n/2)+1; j++){
                answer += j;
                if(answer >= n) break;
            }
            if(answer == n) count++;
            answer = 0;
        }
        return count+1;
    }
}