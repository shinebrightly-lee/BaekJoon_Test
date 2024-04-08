import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            String str = br.readLine();
            int b = 0;
            int x = 0, y = 0;
            int max[] = new int[4];

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == 'R'){
                    b = b >= 3 ? 0 : b+1;
                } else if (c == 'L') {
                    b = b <= 0 ? 3 : b-1;
                } else if (c == 'F') {
                    switch(b) {
                        case 0:
                            y++;
                            max[0] = Math.max(max[0], y); continue;
                        case 1:
                            x++;
                            max[1] = Math.max(max[1], x); continue;
                        case 2:
                            y--;
                            max[2] = Math.min(max[2], y); continue;
                        case 3:
                            x--;
                            max[3] = Math.min(max[3], x);
                    }
                } else if (c == 'B') {
                    switch(b){
                        case 0 :
                            y--;
                            max[2] = Math.min(max[2], y);  continue;
                        case 1:
                            x--;
                            max[3] = Math.min(max[3], x); continue;
                        case 2 :
                            y++;
                            max[0] = Math.max(max[0], y); continue;
                        case 3:
                            x++;
                            max[1] = Math.max(max[1], x);
                    }
                }
            }

            if ((max[0] > 0 || max[2] < 0) && (max[1] > 0 || max[3] < 0)) {
                System.out.println( (max[0] + Math.abs(max[2])) * (max[1] + Math.abs(max[3])) );
            }else {
                System.out.println("0");
            }

        }
    }
}
