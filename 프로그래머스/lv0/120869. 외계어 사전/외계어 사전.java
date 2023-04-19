class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = spell.length;
        for(String d : dic){
            for(String sp : spell){
                answer -= d.contains(sp) ? 1 : 0;
            }
            if(answer == 0) return 1;
            answer = spell.length;
        }
        return 2;
    }
}