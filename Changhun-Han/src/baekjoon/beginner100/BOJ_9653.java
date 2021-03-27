package baekjoon.beginner100;

/**
 * @see <a href="https://www.acmicpc.net/problem/9653">
 * https://www.acmicpc.net/problem/9653
 * </a>
 */
public class BOJ_9653 {
    
    public static void main (String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    8888888888  888    88888\n")
                     .append("   88     88   88 88   88  88\n")
                     .append("    8888  88  88   88  88888\n")
                     .append("       88 88 888888888 88   88\n")
                     .append("88888888  88 88     88 88    888888\n")
                     .append("\n")
                     .append("88  88  88   888    88888    888888\n")
                     .append("88  88  88  88 88   88  88  88\n")
                     .append("88 8888 88 88   88  88888    8888\n")
                     .append(" 888  888 888888888 88  88      88\n")
                     .append("  88  88  88     88 88   88888888");
        System.out.println(stringBuilder);
    }
    
}