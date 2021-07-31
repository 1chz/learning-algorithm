import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int cnt = 9;
        int[] nanJaeng = new int[cnt];
        boolean stop = false;

        for (int i = 0; i < cnt; i++) {
            nanJaeng[i] = Integer.parseInt(br.readLine());
            sum += nanJaeng[i];
        }

        for (int i = 0; i < cnt; i++) {
            if (stop) break;
            for (int j = 0; j < cnt; j++) {
                if (i == j) {
                    continue;
                }
                if (sum - nanJaeng[i] - nanJaeng[j] == 100) {
                    nanJaeng[i] = 0;
                    nanJaeng[j] = 0;
                    stop = true;
                    break;
                }
            }
        }
        Arrays.sort(nanJaeng);

        for(int i = 0; i < 9; i++) {
            if(nanJaeng[i] != 0) {
                bw.write(String.valueOf(nanJaeng[i]) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}