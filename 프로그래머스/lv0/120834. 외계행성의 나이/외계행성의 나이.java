class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = Integer.toString(age); 
        for(int i = 0; i < ageStr.length(); i++){
            answer += String.valueOf( (char)((ageStr.charAt(i)-48)+97) );
        }
        return answer;
    }
}