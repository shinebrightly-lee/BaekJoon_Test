import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();
        StringBuffer answer = new StringBuffer();
        boolean check = false;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '<'){
                check = true;
            } else if (str.charAt(i) == '>') {
                check = false;
                sb.append(str.charAt(i));
                answer.append(sb.toString());
                sb.setLength(0);
                continue;
            }
            if (check){
                sb.append(str.charAt(i));
            }else {
                if (str.charAt(i) == ' '){
                    sb.append(str.charAt(i));
                    answer.append(sb.toString());
                    sb.setLength(0);
                }else {
                    sb.insert(0,str.charAt(i));
                }
            }
        }
        answer.append(sb.toString());
        System.out.println(answer.toString());
    }
}
