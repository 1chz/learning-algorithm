import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        for(int i=1; i <= n; i++){
            if(n % i == 0){ k--; }
            if(k == 0){
                System.out.println(i);
                break;
            }
        }
        if(k != 0){ System.out.println(0); }
    }
}