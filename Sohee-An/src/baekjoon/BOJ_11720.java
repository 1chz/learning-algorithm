import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());
        String num = br.readLine();
        br.close();

        int sum = 0;
        for(int i=0; i < tCase; i++){
            sum += num.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}