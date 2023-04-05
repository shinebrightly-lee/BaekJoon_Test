class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] odArr = Integer.toString(order).split("");
        for(String od : odArr){
            if("3".equals(od)||"6".equals(od)||"9".equals(od)){
                answer++;
            }
        }
        return answer;
    }
}