import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        while(tc-- > 0){
            LinkedList<String> list = new LinkedList<>();
            ListIterator<String> cur = list.listIterator();
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                    switch (str.charAt(i)) {
                        case '<':
                            if (cur.hasPrevious()) {
                                cur.previous();
                            }
                            break;
                        case '>':
                            if (cur.hasNext()) {
                                cur.next();
                            }
                            break;
                        case '-':
                            if (cur.hasPrevious()) {
                                cur.previous();
                                cur.remove();
                            }
                            break;
                        default:
                            cur.add(str.charAt(i) + "");
                    }
            }
            for (String s : list) {
                sb.append(s);
            }
            sb.append("\n");
        }
            System.out.println(sb);
    }
}
