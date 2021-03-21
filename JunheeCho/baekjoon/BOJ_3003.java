package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see <a href="https://www.acmicpc.net/problem/3003">
 * https://www.acmicpc.net/problem/3003 킹, 퀸, 룩, 비숍, 나이트, 폰
 * </a>
 */
public class BOJ_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Pieces defaultCount = new Pieces(1, 1, 2, 2, 2, 8);
        Pieces questionCount = Pieces.fromString(br.readLine());

        Pieces resultCount = defaultCount.minus(questionCount);
        System.out.println(resultCount);

        br.close();
    }
}

class Pieces{
    private int kingCount;
    private int queenCount;
    private int rookCount;
    private int bishopCount;
    private int knightCount;
    private int pawnCount;

    public Pieces(int kingCount, int queenCount, int rookCount, int bishopCount, int knightCount, int pawnCount) {
        this.kingCount = kingCount;
        this.queenCount = queenCount;
        this.rookCount = rookCount;
        this.bishopCount = bishopCount;
        this.knightCount = knightCount;
        this.pawnCount = pawnCount;
    }

    public Pieces(int[] arr) {
        this.kingCount = arr[0];
        this.queenCount = arr[1];
        this.rookCount = arr[2];
        this.bishopCount = arr[3];
        this.knightCount = arr[4];
        this.pawnCount = arr[5];
    }

    public static Pieces fromString(String readLine) {
        final String DELIMITER = " ";
        int[] arr = Arrays.stream(readLine.split(DELIMITER))
                .mapToInt(Integer::parseInt)
                .toArray();
        return new Pieces(arr);
    }


    public Pieces minus(Pieces questionCount) {
        return new Pieces(kingCount - questionCount.kingCount, queenCount - questionCount.queenCount, rookCount - questionCount.rookCount, bishopCount - questionCount.bishopCount, knightCount - questionCount.knightCount, pawnCount - questionCount.pawnCount);
    }

    @Override
    public String toString() {
        final String DELIMITER = " ";
        List<String> strList = Stream.of(kingCount, queenCount, rookCount, bishopCount, knightCount, pawnCount).map(Object::toString).collect(Collectors.toList());
        return String.join(DELIMITER, strList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieces pieces = (Pieces) o;
        return kingCount == pieces.kingCount &&
                queenCount == pieces.queenCount &&
                rookCount == pieces.rookCount &&
                bishopCount == pieces.bishopCount &&
                knightCount == pieces.knightCount &&
                pawnCount == pieces.pawnCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kingCount, queenCount, rookCount, bishopCount, knightCount, pawnCount);
    }
}
