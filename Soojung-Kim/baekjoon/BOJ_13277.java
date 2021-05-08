package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.println(a.multiply(b));

        br.close();
    }
}
