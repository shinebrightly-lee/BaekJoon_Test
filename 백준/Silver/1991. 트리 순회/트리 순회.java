import java.io.*;
import java.util.*;

public class Main {

    static int[] left = new int[26];
    static  int[] right = new int[26];

    static void preOrder(int cur){
        System.out.print((char)(cur+'A'));
        if (left[cur] >  0 ){
            preOrder(left[cur]);
        }
        if (right[cur] > 0){
            preOrder(right[cur] );
        }
    }
    static void inOrder(int cur){
        if (left[cur] >  0 ){
            inOrder(left[cur]);
        }
        System.out.print((char)(cur+'A'));
        if (right[cur] > 0){
            inOrder(right[cur] );
        }
    }
    static void postOrder(int cur){
        if (left[cur] >  0 ){
            postOrder(left[cur]);
        }
        if (right[cur] > 0){
            postOrder(right[cur] );
        }
        System.out.print((char)(cur+'A'));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            int idx = str.charAt(0)-'A';
            int l =  str.charAt(2)-'A';
            int r =str.charAt(4)-'A';
            left[idx] = l;
            right[idx] = r;
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
    }
}

