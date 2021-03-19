import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for (int i =1; i<=n; i++){
            count +=i;
        }
        System.out.println(count);
    }
}
