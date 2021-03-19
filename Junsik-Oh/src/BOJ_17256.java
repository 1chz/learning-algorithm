import java.util.Scanner;

public class BOJ_17256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int[] c = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int[] b = {c[0] - a[2], c[1] / a[1], c[2] - a[0]};

        System.out.printf("%s %s %s", b[0], b[1], b[2]);

        sc.close();




    }
}
