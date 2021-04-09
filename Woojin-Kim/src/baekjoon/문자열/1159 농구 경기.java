// 1159번 농구 경기(Bronze 2)

// 제출 결과 [메모리: 14568KB 시간: 132ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] player = new int[26];
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            char[] name = br.readLine().toCharArray();
            int lastName = (int) name[0]-97;
            player[lastName]++;
        }

        for (int i = 0; i < 26; i++) {
            if(player[i] > 4){
                flag = true;
                System.out.print((char)(i + 97));
            }
        }

        if(!flag)
            System.out.println("PREDAJA");
    }
}