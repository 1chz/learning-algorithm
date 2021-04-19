// 1225번 이상한 곱셈(Bronze 2)

// 제출 결과 [메모리: 18112KB 시간: 1012ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] input_A = input[0].split("");
        String[] input_B = input[1].split("");
        long sum = 0;
        for (String num1 : input_A) {
            for (String num2 : input_B) {
                sum += Integer.parseInt(num1) * Integer.parseInt(num2);
            }
        }

        System.out.println(sum);
        br.close();
    }
}
