package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_5554 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        for(int i=0; i < 4; i++) {
            number += Integer.parseInt(br.readLine());
        }

        System.out.println(number/60);
        System.out.println(number%60);
    }
}
