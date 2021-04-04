import java.util.Scanner;

public class BOJ_17496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();

      int cnt = 0;
      int day = 1 + T;

      while(day <= N) {
          cnt += C;
          day += T;
      }
        System.out.println(cnt * P);

    }
}
