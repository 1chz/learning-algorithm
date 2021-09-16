package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2438 {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int j=1;j<=num;j++){
            for(int i=1;i<=j;i++){
                System.out.printf("%c",'*');
            }
            System.out.println();
        }
    }

}
