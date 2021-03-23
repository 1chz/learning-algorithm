import java.util.Scanner;

public class BOJ_20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.printf("%s %s",(int)(N-(N*0.22)) ,(int) (N*0.8+(N*0.2 - (N*0.2*0.22))) );
    }
}
