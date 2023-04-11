class Solution {
    public int solution(int[] numbers) {
        int answer = -1000000000;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == j) continue;
                if( answer < (numbers[i] * numbers[j]) ){
                    answer = (numbers[i] * numbers[j]);
                }
            }
        }
        return answer;
    }
}