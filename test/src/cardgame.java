import java.util.Scanner;

public class cardgame {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i< 5; i++) {

            int num = sc.nextInt();
            sum += num;
        }

        System.out.println(sum);
    }
}
