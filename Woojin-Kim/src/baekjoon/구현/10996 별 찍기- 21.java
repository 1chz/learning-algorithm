// 10096번 별 찍기 - 21(Bronze 2)

// 제출 결과 [메모리: 26224KB 시간: 532ms]
import java.util.Scanner;

public class BJ_10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n * 2; i++) {
            if(i % 2 == 1) {
                for (int j = 0; j < n; j++) {
                    if(j % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if(j % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}