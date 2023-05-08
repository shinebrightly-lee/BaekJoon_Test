class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int cnt = 0;
        for(String b : babbling){
            cnt = 0;
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) == 'a'){
                    if(i+3 > b.length()){ cnt = 0; break; }
                    else if("aya".equals(b.substring(i,i+3))){ 
                        i += 2;
                        cnt++;
                    }else { cnt = 0; break; }
                }else if(b.charAt(i) == 'y'){
                    if(i+2 > b.length()){ cnt = 0; break; }
                    else if("ye".equals(b.substring(i,i+2))){ 
                        i += 1;
                        cnt++;
                    }else { cnt = 0; break; }
                }else if(b.charAt(i) == 'w'){
                    if(i+3 > b.length()){ cnt = 0; break; }
                    else if("woo".equals(b.substring(i,i+3))){
                        i += 2;
                        cnt++;
                    }else { cnt = 0; break; }
                }else if(b.charAt(i) == 'm'){
                    if(i+2 > b.length()){ cnt = 0; break; }
                    else if("ma".equals(b.substring(i,i+2))){
                        i += 1;
                        cnt++;
                    }else { cnt = 0; break; }
                }else{ cnt = 0; break; }
            }
            answer += cnt > 0 ? 1 : 0;
        }
        
        return answer;
    }
}