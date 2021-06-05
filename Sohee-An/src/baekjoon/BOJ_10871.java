import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i < arr.length; i++){
            int a = sc.nextInt();
            if(a < x){
                arr[i] += a;
                System.out.printf(arr[i] + " ");
            }
        }
        sc.close();
    }
}