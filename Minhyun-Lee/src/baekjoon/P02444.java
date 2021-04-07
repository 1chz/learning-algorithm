import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/2444">별찍기-7</a>
 */
//public class P02444 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i < n; i++) {
//            for (int j = n - i; j > 0; j--) {
//                sb.append(" ");
//            }
//
//            for (int j = 0; j < ((n * 2) - 1) - ((n - i) * 2); j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//
//        for (int i = 0; i < (n * 2) - 1; i++) {
//            sb.append("*");
//        }
//        sb.append("\n");
//
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <= i; j++) {
//                sb.append(" ");
//            }
//
//            for (int j = 0; j < ((n * 2) - 1) - (i * 2); j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//
//        System.out.println(sb.toString());
//    }
//}

//다른사람 풀이 참고
public class P02444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) - 1;
        StringBuilder sb = new StringBuilder();

        String stars;
        for (int i = 0; i <= n; i++) {
            stars = "*".repeat(i);
            sb.append(" ".repeat(n - i))
                    .append(stars)
                    .append("*")
                    .append(stars)
                    .append("\n");
        }

        for (int i = 1; i <= n; i++) {
            stars = "*".repeat(n - i);
            sb.append(" ".repeat(i))
                    .append(stars)
                    .append("*")
                    .append(stars)
                    .append("\n");
        }

        System.out.println(sb.toString());
    }
}