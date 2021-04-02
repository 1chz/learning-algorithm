package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Baekjoon_5522 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        for(int i=0; i<5; i++) {
            int number = Integer.parseInt(br.readLine());
            result += number;
        }

        System.out.println(result);
    }
}
