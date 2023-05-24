import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] dbStr : db){
            if(id_pw[0].equals(dbStr[0])){
                if(id_pw[1].equals(dbStr[1])){
                    return "login";
                }else{ answer = "wrong pw"; }
            }else{
                if("".equals(answer)){
                    answer = "fail"; 
                }
            }
        }
        return answer;
    }
}