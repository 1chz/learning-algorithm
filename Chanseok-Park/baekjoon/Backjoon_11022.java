package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Backjoon_11022 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int i=0; i < cnt; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            System.out.println("Case #"+ (i+1) + " : " + first + "+" + second + " = " + (first+second));
        }
        sc.close();
    }
}
