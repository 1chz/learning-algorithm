import java.util.Scanner;

public class BOJ_5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();

        int b1 = sc.nextInt();
        int b2= sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();

        if((a1+a2+a3+a4) > (b1+b2+b3+b4)){
            System.out.println(a1+a2+a3+a4);
        }else {
            System.out.println(b1+b2+b3+b4);
        }

    }
}
