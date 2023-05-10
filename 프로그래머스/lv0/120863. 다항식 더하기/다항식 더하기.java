import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String[] polynomialArr = polynomial.split(" \\+ ");
        int xCnt = 0;
        int num = 0;
        for(String p : polynomialArr){
            if(p.equals("x")){
                xCnt++;
            }else if(p.contains("x")){
                xCnt += Integer.parseInt(p.substring(0, p.length()-1));
            }else{
                num += Integer.parseInt(p);
            }
        }

        StringBuffer sb = new StringBuffer();
        if(xCnt > 1){
            sb.append(xCnt+"x");
            if(num > 0) sb.append(" + " + num);
        }else if(xCnt == 1){
            sb.append("x");
            if(num > 0) sb.append(" + " + num);
        }else{
            if(num > 0) sb.append(num + "");
        }
        
        return sb.toString();
    }
}