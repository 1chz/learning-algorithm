package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_16430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(b-a+" "+b);
        br.close();
    }
}
