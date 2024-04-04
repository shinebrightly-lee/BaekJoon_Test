import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] swc = new boolean[switchNum];
        int studentsNum = Integer.parseInt(br.readLine());
        int idx = 0;
        while (st.hasMoreTokens()){
            swc[idx++] = st.nextToken().equals("1");
        }

        for (int i = 0; i < studentsNum; i++){
            StringTokenizer studentInfo = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(studentInfo.nextToken());
            int num = Integer.parseInt(studentInfo.nextToken());
            idx = 0;
            if (gender == 1){
                for (int j = num; j <= switchNum; j = j+num) {
                    swc[j-1] = !swc[j-1];
                }
            }else{
                idx++;
                if (num >= 2 && num < switchNum){
                    if (swc[num] != swc[num-2]){
                        swc[num-1] = !swc[num-1];
                    }else{
                        swc[num-1] = !swc[num-1];
                        for (int j = num; j < switchNum; j++) {
                            if((num-1)-idx < 0 || (num-1)+idx >= switchNum){ break; }
                            if (swc[(num-1)+idx] != swc[(num-1)-idx]){ break; }
                            swc[(num-1)-idx] = !swc[(num-1)-idx];
                            swc[(num-1)+idx] = !swc[(num-1)+idx];
                            idx++;
                        }
                    }
                }else {
                        swc[num-1] = !swc[num-1];
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < swc.length; i++) {
            sb.append( swc[i] ? "1 " : "0 " );
            if ( i >= 1 && (i+1)%20 == 0){
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
