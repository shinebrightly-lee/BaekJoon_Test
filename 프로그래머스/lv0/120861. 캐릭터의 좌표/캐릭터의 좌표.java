class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int one = 0;
        int two = 0;
        for(int i = 0; i < keyinput.length; i++){
            if("left".equals(keyinput[i])){
                if(-(board[0]/2) >= one) continue;
                one--;
            }else if("right".equals(keyinput[i])){
                if(board[0]/2 <= one) continue;
                one++;
            }else if("up".equals(keyinput[i])){
                if(board[1]/2 <= two) continue;
                two++;
            }else if("down".equals(keyinput[i])){
                if(-board[1]/2 >= two) continue;
                two--;
            }
        }
        board[0] = one;
        board[1] = two;
        return board;
    }
}