// 5543번 상근날드(Bronze 4)

// 제출 결과 [메모리: 14704KB 시간: 132ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_5543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] hamburger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {
            hamburger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(hamburger);
        Arrays.sort(drink);
        System.out.println(hamburger[0]+drink[0]-50);
    }
}
