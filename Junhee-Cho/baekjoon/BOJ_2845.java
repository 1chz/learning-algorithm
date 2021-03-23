package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * @see <a href="https://www.acmicpc.net/problem/2845">
 * https://www.acmicpc.net/problem/2845 파티가 끝나고 난 뒤
 * </a>
 */
public class BOJ_2845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int peopleOfSqaure = Integer.parseInt(st.nextToken());
        final int area = Integer.parseInt(st.nextToken());

        final int peopleOfArea = peopleOfSqaure * area;

        final String DELIMITER = " ";
        List<Integer> newsCount = Arrays.stream(br.readLine().split(DELIMITER))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> resultList = newsCount.stream()
                .map((num) -> num - peopleOfArea)
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(DELIMITER, resultList));

        br.close();
    }
}
