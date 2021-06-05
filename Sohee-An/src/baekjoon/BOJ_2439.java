import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        sc.close();

        for(int i = 1; i <= star; i++){
            for(int j = 1; j <= star-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}