import java.util.Scanner;

public class BOJ_10039 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0 ;
        for(int i = 0; i < 5; i++) {

            int val = in.nextInt();

            sum += val > 40 ? val : 40;

        }
        System.out.println(sum/5);
    }
}

