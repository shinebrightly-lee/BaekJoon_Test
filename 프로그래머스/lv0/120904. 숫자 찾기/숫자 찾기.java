class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String nums = Integer.toString(num);
        for(int i = 0; i < nums.length(); i++){
            if(nums.charAt(i) == (char)(k+48)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}