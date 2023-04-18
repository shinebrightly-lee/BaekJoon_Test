import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put( s.charAt(i), map.get(s.charAt(i))+1 );
                continue;
            }
            map.put(s.charAt(i),1);
            idx++;
        }
        char[] ch = new char[idx];
        idx = 0;
        for(Character c : map.keySet()){
            if(map.get(c) == 1){
                ch[idx] = c;
                idx++;
            }
        }
        Arrays.sort(ch);
        StringBuffer sb = new StringBuffer();
        for(char c : ch){
            if(c == '\u0000') continue;
            sb.append(c);
        }
        return sb.toString();
    }
}