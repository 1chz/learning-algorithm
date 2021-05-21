import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mulTab = sc.nextInt();
        int plug = 1;

        for(int i=0; i < mulTab; i++) {
            plug += sc.nextInt();
        }
        plug -= mulTab;
        System.out.println(plug);
        sc.close();
    }
}