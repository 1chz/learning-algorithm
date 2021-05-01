package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/1475">방 번호</a>
 */
public class P01475 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        double[] numbers = new double[10];
//        int set = 0;
//        String n = br.readLine();
//
//        for(int i = 0; i < n.length(); i++) {
//            numbers[n.charAt(i) - '0']++;
//        }
//
//        for(int i = 0; i < 9; i++) {
//            if(i == 6) {
//                set = (int) Math.max(set, Double.min(numbers[6], numbers[9]) + Math.ceil(Math.abs(numbers[6] - numbers[9]) / 2));
//            } else {
//                set = (int) Math.max(set, numbers[i]);
//            }
//        }
//
//        System.out.println(set);
//    }

    //다른사람이 푼 방식 참고
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        int set = 0;

        String n = br.readLine();

        int index;
        for(int i = 0; i < n.length(); i++) {
            index = n.charAt(i) - '0';

            if(index == 9) {
                numbers[6]++;
            } else {
                numbers[index]++;
            }
        }

        numbers[6] = (numbers[6] / 2) + (numbers[6] % 2);
        for(int i = 0; i < 9; i++) {
                set = Math.max(set, numbers[i]);
        }

        System.out.println(set);
    }
}