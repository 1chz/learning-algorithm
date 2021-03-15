package baekjoon;

import java.io.IOException;

/**
 * @see <a href="https://www.acmicpc.net/problem/9654">
 * https://www.acmicpc.net/problem/9654
 * </a>
 */
public class BOJ_9654 {
    
    public static void main (String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n")
                     .append("N2 Bomber      Heavy Fighter  Limited    21        \n")
                     .append("J-Type 327     Light Combat   Unlimited  1         \n")
                     .append("NX Cruiser     Medium Fighter Limited    18        \n")
                     .append("N1 Starfighter Medium Fighter Unlimited  25        \n")
                     .append("Royal Cruiser  Light Combat   Limited    4         \n");
        System.out.println(stringBuilder);
    }
    
}