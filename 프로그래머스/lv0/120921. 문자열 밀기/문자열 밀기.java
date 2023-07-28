import java.util.*;

class Solution {
    public int solution(String A, String B) {
        if(A.length() != B.length()) return -1;
        if(A.equals(B)) return 0;
        
        StringBuffer sb = new StringBuffer();
        sb.append(A);

        for(int i = 0; i < A.length(); i++){
            if(B.equals(sb.toString())){
                return i;
            }
            sb.insert(0,sb.charAt(A.length()-1)+"");
            sb.delete(A.length(),A.length()+1);
        }
        
        return -1;
    }
}