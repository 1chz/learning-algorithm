import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
		int xMin = Math.min(x, w-x);
		int yMin = Math.min(y, h-y);
        
        System.out.println(Math.min(xMin, yMin));
	}
}