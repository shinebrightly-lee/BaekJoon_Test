class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++){
            if( my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57 ){
                sb.append(my_string.charAt(i));
                continue;
            }
            if(sb.length() == 0) continue;
            answer += Integer.parseInt(sb.toString());
            sb.setLength(0);
        }
        answer += sb.length() != 0 ? Integer.parseInt(sb.toString()) : 0;
        return answer;
    }
}