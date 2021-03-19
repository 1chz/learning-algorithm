import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/11284">초성 중성 종성</a>
 */
public class P11284 {
    // 유니코드 한글 시작 : 44032(0xAC00), 끝 : 55199;
    //한글 유니코드 생성규칙 : (초성 * 21 + 중성) * 28 + 종성 + 0xAC00
    private static final int HANGUL_START = 44032;

    private static final char[] CHOSUNG_LIST = {
            'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ',
            'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };

    private static final char[] JOONGSUNG_LIST = {
            'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ',
            'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ',
            'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ',
            'ㅡ', 'ㅢ', 'ㅣ'
    };

    private static final char[] JONGSUNG_LIST = {
            ' ', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ',
            'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ',
            'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ',
            'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char hangul = br.readLine().charAt(0);

        int cho = ((hangul - HANGUL_START) / 28) / 21;
        int joong = (hangul - HANGUL_START) / 28 % 21;
        int jong = (hangul - HANGUL_START) % 28;

        System.out.println(CHOSUNG_LIST[cho]);
        System.out.println(JOONGSUNG_LIST[joong]);
        System.out.println(JONGSUNG_LIST[jong]);
    }
}