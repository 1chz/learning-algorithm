import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/11283">한글2</a>
 */
public class P11283 {
    // 유니코드 한글 시작 : 44032(0xAC00), 끝 : 55199;
    //한글 유니코드 생성규칙 : (초성 * 21 + 중성) * 28 + 종성 + 0xAC00
    private static final int HANGUL_START = 44032;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char hangul = br.readLine().charAt(0);

        System.out.println((hangul - HANGUL_START) + 1);
    }
}