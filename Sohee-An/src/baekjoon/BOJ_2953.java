import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int score = 0, win = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < 4; j++){
                arr[i] += sc.nextInt();
            }
            if (score < arr[i]) {
                score = arr[i];
                win = i+1;
            }
        }
        System.out.printf("%d %d", win, score);
    }
}