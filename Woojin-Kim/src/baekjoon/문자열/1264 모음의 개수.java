// 1264번 모음의 개수(Bronze 2)

// 제출 결과 [메모리: 14420KB 시간: 140ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int count = 0;
            String[] input = br.readLine().split("");
            if(input[0].equals("#")) {
                br.close();
                return;
            }
            for (String word : input) {
                word = word.toLowerCase();
                if (word.equals("a") || word.equals("e") || word.equals("i") || word.equals("o") || word.equals("u")){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}