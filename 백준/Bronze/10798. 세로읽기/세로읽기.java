import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] strArr = new String[5][];
        int maxLen = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++){
            strArr[i] = br.readLine().split("");
            maxLen = Math.max(strArr[i].length, maxLen);
        }
        for (int i = 0; i <= maxLen; i++){
            for (int j = 0; j < 5; j++){
                if(strArr[j].length > i){
                    sb.append(strArr[j][i]);
                }else{continue;}
            }
        }
        System.out.println(sb.toString());
    }
}
