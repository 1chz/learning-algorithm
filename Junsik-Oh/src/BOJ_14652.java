import java.util.Scanner;

public class BOJ_14652 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int spotNum = sc.nextInt();



        System.out.printf("%d %d", spotNum/M, spotNum%M);

    }
}
