import java.util.Scanner;

public class BOJ_20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prize = sc.nextInt();


        double prizeMoney = prize - (prize * 0.22);
        double prizeSecondMoney = (prize * 0.8) + ((prize*0.2) - ((prize * 0.2) * 0.22));


        System.out.printf("%d %d", Math.round(prizeMoney), Math.round(prizeSecondMoney));


    }
}
