import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());
        String star = "*";
        String space = " ";

        for(int i = 1; i <= 2*tCase; i++){ // 행
            for(int j = i; j < i+tCase; j++){ // 열
                if(j % 2 == 0){
                    System.out.print(space);
                } else {
                    System.out.print(star);
                }
            }
            System.out.print("\n");
        }
    }
}