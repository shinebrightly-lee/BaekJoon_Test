class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int left = 0; left < prices.length; left++){
            int check = 0;
            int right;
            for(right = left+1; right < prices.length; right++ ){
                if(prices[left] > prices[right]){
                    check = right - left;
                    break;
                }
            }
            answer[left] = check != 0 ? check : (prices.length-1)-left;
        }
        return answer;
    }
}