import java.util.Scanner;

public class errand {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i =0; i < 4; i++) {
            int distance = sc.nextInt();
            sum += distance;
        }

        System.out.printf("%d \n" , (sum /60));
        System.out.printf("%d \n" , (sum % 60));
    }
}
