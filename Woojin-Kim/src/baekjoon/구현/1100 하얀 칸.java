// 1100번 하얀 칸(Bronze 2)

// 제출 결과 [메모리: 14580KB 시간: 144ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] map = new String[8][8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < 8; j++) {
                map[i][j] = input[j];
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(map[i][j].equals("F")){
                    if(i % 2 == 0 && j % 2 == 0) count++;
                    else if (i % 2 == 1 && j % 2 == 1) count++;
                }
            }
        }

        System.out.println(count);
    }
}
