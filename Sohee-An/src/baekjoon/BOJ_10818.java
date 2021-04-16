import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArray[] = new int[n];
    
        for(int i=0; i<n; i++){
          numArray[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(numArray);
        System.out.println(numArray[0] + " " + numArray[n-1]);
	}
}