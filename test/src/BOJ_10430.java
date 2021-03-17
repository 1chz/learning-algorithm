import java.util.Scanner;

public class BOJ_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b) % c );
        System.out.println(((a%c) + (b %c))%c );
        System.out.println((a*b)%c);
        System.out.println( ((a%c) * (b%c)) % c );





    }
}
