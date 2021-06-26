import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr;
        int C = Integer.parseInt(br.readLine()); // testCase

        for(int i=0; i < C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            arr = new int[N];
            int sum = 0; // 합계
            int stuCnt = 0; // 평균이 넘는 학생 수

            for(int j=0; j < N; j++){
                int score = Integer.parseInt(st.nextToken()); // 점수
                arr[j] = score;
                sum += score;
            }
            double avg = (sum / N);

            for(int j=0; j < N; j++){
                if(arr[j] > avg){
                    stuCnt++;
                }
            }
            bw.write( String.format("%.3f", (double)stuCnt / N * 100) + "% \n");
        }
        bw.flush();
        bw.close();
    }
}