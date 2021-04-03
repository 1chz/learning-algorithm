import java.util.Scanner;


public class BOJ_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b= 0;
        int sum= 0;

        for(int i = 0; i< 5; i++) {
            b = sc.nextInt();
            if(a == b) {
                sum ++;
            }
        }

        sc.close();
        System.out.println(sum);

    }
}
