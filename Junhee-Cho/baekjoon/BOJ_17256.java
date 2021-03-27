package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/17256">
 * https://www.acmicpc.net/problem/17256 달달함이 넘쳐흘러
 * </a>
 */
public class BOJ_17256 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        CakeNumber A = new CakeNumber(st.nextToken(), st.nextToken(), st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        CakeNumber C = new CakeNumber(st2.nextToken(), st2.nextToken(), st2.nextToken());

        CakeNumber B = A.unCake(C);
        System.out.println(B);

        br.close();
    }
}

class CakeNumber {
    private int x;
    private int y;
    private int z;

    public CakeNumber(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public CakeNumber(String x, String y, String z) {
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
        this.z = Integer.parseInt(z);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public CakeNumber unCake(CakeNumber cakeNumber){
        return new CakeNumber(cakeNumber.getX() - z, cakeNumber.getY() / y, cakeNumber.getZ() - x);
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CakeNumber that = (CakeNumber) o;
        return x == that.x &&
                y == that.y &&
                z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
